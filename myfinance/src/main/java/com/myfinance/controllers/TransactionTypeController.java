package com.myfinance.controllers;

import com.myfinance.commons.GenericController;
import com.myfinance.domains.Person;
import com.myfinance.domains.TransactionType;
import com.myfinance.service.PersonService;
import com.myfinance.service.TransactionTypeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/transaction-type")
public class TransactionTypeController extends GenericController<TransactionType, Long, TransactionTypeService> {
    private final TransactionTypeService service;

    public TransactionTypeController(TransactionTypeService service){
        super(service);
        this.service = service;
    }
}
