package com.bashir.spring.service;

import com.bashir.spring.dao.AccountDao;
import com.bashir.spring.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class AccountService {

    @Autowired
    private AccountDao accountDao;


    public String findByName(String name) {
        Account account = accountDao.findByName(name);
        account.setName("5555");
        return account.getPassword();
    }
}
