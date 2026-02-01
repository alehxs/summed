package com.alehxs.summed.services;

import java.util.List;

import com.alehxs.summed.model.Account;
import com.alehxs.summed.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    private final AccountRepository repository;

    public AccountService (AccountRepository repository) {
        this.repository = repository;
    }

    public List<Account> getAllAccounts() {
        return repository.findAll();
    }
}
