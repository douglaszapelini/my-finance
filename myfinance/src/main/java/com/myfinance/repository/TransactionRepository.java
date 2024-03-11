package com.myfinance.repository;

import com.myfinance.commons.GenericRepository;
import com.myfinance.domains.Person;
import com.myfinance.domains.Transaction;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends GenericRepository<Transaction, Long> {
}
