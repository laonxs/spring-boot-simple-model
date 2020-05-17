package cn.laonxs.controller;

import cn.laonxs.domain.User;
import cn.laonxs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User模块的Controller
 *
 * @author ade
 * @version 1.0，2020-05-17 17:15:32
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findUserList")
    public List<User> findUserList() {
        return userService.findUserList();
    }

}
