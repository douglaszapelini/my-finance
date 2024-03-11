package com.myfinance.service;

import com.myfinance.commons.GenericService;
import com.myfinance.domains.Person;
import com.myfinance.domains.TransactionType;
import com.myfinance.repository.PersonRepository;
import com.myfinance.repository.TransactionTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionTypeService extends GenericService<TransactionType, Long, TransactionTypeRepository> {
    public final TransactionTypeRepository repository;
    public TransactionTypeService(TransactionTypeRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
