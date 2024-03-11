package com.myfinance.controllers;

import com.myfinance.commons.GenericController;
import com.myfinance.domains.Person;
import com.myfinance.service.PersonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/person")
public class PersonController extends GenericController<Person, Long, PersonService> {
    private final PersonService service;

    public PersonController(PersonService service){
        super(service);
        this.service = service;
    }
}
