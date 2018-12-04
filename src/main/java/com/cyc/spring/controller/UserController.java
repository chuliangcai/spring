package com.cyc.spring.controller;

import com.cyc.spring.dao.UserDao;
import com.cyc.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping
    public void delete() {


        List<User> users = userDao.findAll();
        userDao.deleteAll(users);
    }
}
