package com.dailycodechallege.userservice.Controller;

import com.dailycodechallege.userservice.Entity.User;
import com.dailycodechallege.userservice.Service.UserService;
import com.dailycodechallege.userservice.VO.ResponseTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/SaveUser")
    public User SaveUser (@RequestBody  User user)
    {
        return userService.saveUser(user);
    }

    @GetMapping("/GetUser/{id}")
    public ResponseTemplate getUser(@PathVariable("id") Long userId)
    {
        return userService.getUser(userId);
    }
}
