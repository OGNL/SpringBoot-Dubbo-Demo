package com.demo.controller;


import com.demo.entity.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zhangtao on 2018/2/16.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/select/{id}",method = RequestMethod.GET)
    public User getUserById(@PathVariable("id") int id){
            return userService.selectUserById(id);
    }

    @RequestMapping(value="/add",method = RequestMethod.POST)
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }
}
