package com.bashir.spring.dao;

import com.bashir.spring.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface AccountDao extends JpaRepository<Account, Long> {

    Account findByName(String name);

}
