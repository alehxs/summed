package com.alehxs.summed.repository;

import com.alehxs.summed.model.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountRepository {

    public List<Account> findAll() {
        return List.of(
                new Account("1", "Checkings", "Chase Checkings", "JP Morgan Chase"),
                new Account("2", "High Yield Savings", "Ally HYS", "Ally"),
                new Account("3", "BoA Savings", "Bank of America Savings", "Bank of America")
        );
    }
}
