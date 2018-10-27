package com.cybrilla.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cybrilla.entity.Transaction;
import com.cybrilla.service.TransactionService;

@RestController
public class TransactionController 
{
	@Autowired
	private TransactionService service;
	
	@PostMapping("/doTransaction")
	public void transferAmount(@RequestBody Transaction transaction)
	{
		service.doTransaction(transaction);
	}

}
