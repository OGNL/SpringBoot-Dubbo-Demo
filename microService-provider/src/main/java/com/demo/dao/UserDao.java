package com.demo.dao;

import com.demo.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by zhangtao on 2018/2/16.
 */
@Repository
public interface UserDao {

    User selectUserById(int id);

    void addUser(User user);
}
