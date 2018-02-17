package com.demo.service;


import com.demo.entity.User;

/**
 * Created by zhangtao on 2018/2/16.
 */
public interface UserService {

    User selectUserById(int id);

    void addUser(User user);
}
