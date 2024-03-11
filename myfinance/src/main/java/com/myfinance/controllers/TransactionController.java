package com.myfinance.controllers;

import com.myfinance.commons.GenericController;
import com.myfinance.domains.Person;
import com.myfinance.domains.Transaction;
import com.myfinance.service.PersonService;
import com.myfinance.service.TransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value="/transaction")
public class TransactionController extends GenericController<Transaction, Long, TransactionService> {
    private final TransactionService service;

    public TransactionController(TransactionService service){
        super(service);
        this.service = service;
    }
}
