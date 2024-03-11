package com.myfinance.repository;

import com.myfinance.commons.GenericRepository;
import com.myfinance.domains.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends GenericRepository<Person, Long> {
}
