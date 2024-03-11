package com.myfinance.repository;

import com.myfinance.commons.GenericRepository;
import com.myfinance.domains.Person;
import com.myfinance.domains.TransactionType;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionTypeRepository extends GenericRepository<TransactionType, Long> {
}
