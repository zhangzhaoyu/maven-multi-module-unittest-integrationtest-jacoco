package cn.cincout.test.web;

import cn.cincout.test.service.User;
import cn.cincout.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaoyu on 20-7-26.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/{id:\\d+}")
    public User getUserById(@PathVariable Integer id) {
        return userService.getById(id);
    }
}
