package com.myfinance.service;

import com.myfinance.commons.GenericService;
import com.myfinance.domains.Person;
import com.myfinance.domains.Transaction;
import com.myfinance.repository.PersonRepository;
import com.myfinance.repository.TransactionRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionService extends GenericService<Transaction, Long, TransactionRepository> {
    public final TransactionRepository repository;
    public TransactionService(TransactionRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
