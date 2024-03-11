package com.myfinance.service;

import com.myfinance.commons.GenericService;
import com.myfinance.domains.Person;
import com.myfinance.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService extends GenericService<Person, Long, PersonRepository> {
    public final PersonRepository repository;
    public PersonService(PersonRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
