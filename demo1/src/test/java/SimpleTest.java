import com.lauandy.j2eedemo.demo1.dao.UserDao;
import com.lauandy.j2eedemo.demo1.entity.Role;
import com.lauandy.j2eedemo.demo1.entity.User;
import com.lauandy.j2eedemo.demo1.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yangzhichao on 15/9/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/applicationContext.xml" })
public class SimpleTest {

    @Resource
    private UserService userService;

    @Test
    public void test(){

        //System.out.println(userDao.getUserById(1));
        User user = new User();
        user.setName("chao");
        user.setSex("0");
        user.setEmail("chao@sina.com");
        //System.out.println(userService.insertUser(user));
        //Map<String,String> params = new HashMap<>(3);
        //params.put("name","yang");
        //System.out.println(userService.getUserList(params));
        Role role = new Role();
        role.setName("admin");
        //userService.insertRole(role);
        userService.insertUserAndRole();


    }



}
