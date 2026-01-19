package com.alehxs.summed.repository;

import com.alehxs.summed.model.Transaction;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Repository
public class TransactionRepository {

    public List<Transaction> findAll() {
        return List.of(
                new Transaction("1", "Test", new BigDecimal("100.00"), LocalDate.of(2000, 1, 1), "iPad", "900", "testCategory"),
                new Transaction("2", "Test2", new BigDecimal("22.50"), LocalDate.of(2026, 1, 11), "Chick-fil-a", "29", "Food & Drinks"),
                new Transaction("3", "Test3", new BigDecimal("225.50"), LocalDate.of(2026, 1, 1), "Pirelli Tyres", "67", "Utilites")
        );
    }
}
