package com.bashir.spring.controller;

import com.bashir.spring.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    @Autowired
    private AccountDao accountDao;

    @GetMapping("/find-by-name")
    public String findByName(String name) {
        return accountDao.findByName(name).getPassword();
    }
}
