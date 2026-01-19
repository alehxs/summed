package com.alehxs.summed.services;

import java.util.List;

import com.alehxs.summed.model.Transaction;
import com.alehxs.summed.repository.TransactionRepository;
import org.springframework.stereotype.Service;


@Service
public class TransactionService {

    private final TransactionRepository repository;

    public TransactionService(TransactionRepository repository){
        this.repository = repository;
    }

    public List<Transaction> getAllTransactions () {
        return repository.findAll();
    }
}
