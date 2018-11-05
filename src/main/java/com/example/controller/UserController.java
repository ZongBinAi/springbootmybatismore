package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/insert01")
    public String insert01() {
        userService.insert01("马超", 30);
        return "success";
    }

    @RequestMapping("/insert02")
    public String insert02() {
        userService.insert01("curry", 30);
        return "success";
    }

    @RequestMapping("/findByName01")
    public User findByName01() {
        return userService.findByName01("james");
    }

    @RequestMapping("/findByName02")
    public User findByName02() {
        return userService.findByName02("张飞");
    }

}
