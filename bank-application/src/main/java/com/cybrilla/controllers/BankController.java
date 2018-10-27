package com.cybrilla.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cybrilla.entity.BankCustomer;
import com.cybrilla.service.BankService;

@RestController
public class BankController 
{
	
	@Autowired
	BankService service;
	
	@PostMapping("/registercustomer")
	public BankCustomer addCustomer(@RequestBody BankCustomer customer)
	{
		BankCustomer cus = service.createUser(customer);
		return cus;
	}
	
	@GetMapping("/getdetails")
	public BankCustomer getCustomerDetails(@RequestParam int customerId)
	{
		return service.fetchUserDetails(customerId);
	}
	
	@PutMapping("/deposit")
	public BankCustomer deposit(@RequestBody BankCustomer customer)
	{
		return service.deposit(customer);
	}
	
	@PutMapping("/updateCustomerDetails")
	public BankCustomer updateBankAccountTypeDetails(@RequestBody BankCustomer customer)
	{
		return service.updateBankDetails(customer);
	}

}
