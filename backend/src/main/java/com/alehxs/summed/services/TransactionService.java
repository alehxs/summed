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

    public Transaction getTransactionById (String id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transaction not found" + id));
    }

    public Transaction createTransaction (Transaction transaction) {
        return repository.save(transaction);
    }

    public Transaction updateTransaction(String id, Transaction transaction) {
        if (!transaction.getId().equals(id)) {
            throw new IllegalArgumentException(
                    "Path ID (" + id + ") does not match body ID (" + transaction.getId() + ")"
            );
        }

        return repository.update(id, transaction)
                .orElseThrow(() -> new RuntimeException("Transaction could not be updated" + id));
    }
}
