package com.bashir.spring.controller;

import com.bashir.spring.dao.AccountDao;
import com.bashir.spring.model.Account;
import com.bashir.spring.pojo.AccountVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class RegistryController {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@Valid AccountVo accountVo) {
        Account account = new Account();
        account.setName(accountVo.getName());
        account.setPassword(passwordEncoder.encode(accountVo.getPassword()));
        account.setEmail(accountVo.getEmail());
        accountDao.save(account);
        return "login";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register() {
        return "register";
    }
}
