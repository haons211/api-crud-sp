package com.usercrud.usercrud.service;

import com.usercrud.usercrud.model.Account;
import com.usercrud.usercrud.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public void addNewAccount(String username,String password) {/**/
        Account account = new Account(username,password);
         accountRepository.save(account);
    }

}
