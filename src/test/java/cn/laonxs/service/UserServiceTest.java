package cn.laonxs.service;

import cn.laonxs.Application;
import cn.laonxs.domain.User;
import cn.laonxs.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * User模块的Service测试
 *
 * @author ade
 * @version 1.0，2020-05-17 17:24:02
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class UserServiceTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void findUserList() {
        List<User> users = userMapper.findUserList();
        users.forEach(user -> System.out.println(user.toString()));
    }

}
