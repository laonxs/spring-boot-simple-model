package cn.laonxs.service;

import cn.laonxs.domain.User;
import cn.laonxs.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User模块的Service
 *
 * @author ade
 * @version 1.0，2020-05-17 17:13:29
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findUserList() {
        return userMapper.findUserList();
    }

}
