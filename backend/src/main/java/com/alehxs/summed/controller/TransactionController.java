package com.alehxs.summed.controller;

import com.alehxs.summed.model.Transaction;
import com.alehxs.summed.services.TransactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionController {

    private final TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @GetMapping("/transactions")
    public List<Transaction> getAllTransactions() {
        return service.getAllTransactions();
    }
}
