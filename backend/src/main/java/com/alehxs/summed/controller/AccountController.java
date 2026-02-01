package com.alehxs.summed.controller;

import java.util.List;

import com.alehxs.summed.model.Account;
import com.alehxs.summed.services.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    private final AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }

    @GetMapping("/accounts")
    public List<Account> getAllAccounts() { return service.getAllAccounts(); }


}
