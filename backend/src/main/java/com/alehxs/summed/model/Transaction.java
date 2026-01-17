package com.alehxs.summed.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transaction {
    final String id;
    final String name;
    final BigDecimal amount;
    final LocalDate date;
    final String description;
    final String accountId;
    final String categoryId;

    public Transaction(String id, String name, BigDecimal amount, LocalDate date, String description, String accountId, String categoryId) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.date = date;
        this.description = description;
        this.accountId = accountId;
        this.categoryId = categoryId;
    }

    public String getId() { return id;  }

    public String getName() { return name; }

    public BigDecimal getAmount() { return amount; }

    public LocalDate getDate() { return date; }

    public String getDescription() { return description; }

    public String getAccountId() { return accountId; }

    public String getCategoryId() { return categoryId; }

    public String toString() {
        return "Transaction{id='" + id + "', name='" + name + ", amount='" + amount + ", date='" + date + ", description='" + description + ", accountId='" + accountId + ", categoryId='" + categoryId+ "'}";
    }
}
