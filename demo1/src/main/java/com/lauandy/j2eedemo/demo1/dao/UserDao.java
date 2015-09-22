package com.lauandy.j2eedemo.demo1.dao;

import com.lauandy.j2eedemo.demo1.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


/**
 * Created by yangzhichao on 15/9/22.
 */
@Repository
public interface UserDao {

    int insertUser(User user);

    User getUserById(int id);

    List<User> getUserList(Map<String,String> params);


}
