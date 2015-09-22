package com.lauandy.j2eedemo.demo1.service;

import com.lauandy.j2eedemo.demo1.dao.RoleDao;
import com.lauandy.j2eedemo.demo1.dao.UserDao;
import com.lauandy.j2eedemo.demo1.entity.Role;
import com.lauandy.j2eedemo.demo1.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by yangzhichao on 15/9/22.
 */
@Component
public class UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    public int insertUser(User user){
        return userDao.insertUser(user);
    }

    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    public List<User> getUserList(Map<String,String> params){
        return userDao.getUserList(params);
    }

    public int insertRole(Role role){
        return roleDao.insertRole(role);
    }

    public void exception(){
        throw new RuntimeException("test transaction");
    }


    @Transactional
    public void insertUserAndRole(){
        User user = new User();
        user.setName("tom");
        user.setSex("1");
        user.setEmail("tom@sina.com");
        insertUser(user);

        exception();

        Role role = new Role();
        role.setName("admin");
        insertRole(role);
    }

}
