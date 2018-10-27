package com.cybrilla.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybrilla.entity.BankCustomer;
import com.cybrilla.exception.CustomerNotFoundException;
import com.cybrilla.repository.BankRepository;

@Service
public class BankService 
{
	@Autowired
	private BankRepository repo;
	
	public BankCustomer createUser(final BankCustomer customer)
	{
		return repo.save(customer);
	}
	
	public BankCustomer fetchUserDetails(final int customerId)
	{
		if(repo.exists(customerId))
		{
			return repo.findOne(customerId);
		}
		throw new CustomerNotFoundException("Customer Details Not Found >>> "+customerId);
	}
	
	public BankCustomer deposit(final BankCustomer customer)
	{
		if(repo.exists(customer.getCustomerNumber()))
		{
			BankCustomer updateCustomer = repo.findOne(customer.getCustomerNumber());
			updateCustomer.setBalance(customer.getBalance());
			return repo.save(updateCustomer);
		}
		throw new CustomerNotFoundException("Deposit Not Possible for Not Existing Customer >>> "+customer.getCustomerNumber());
	}
	
	public BankCustomer updateBankDetails(final BankCustomer customer)
	{
		if (repo.exists(customer.getCustomerNumber())) 
		{
			BankCustomer updateCustomer = repo.findOne(customer.getCustomerNumber());
			updateCustomer.setBalance(customer.getBalance());
			return repo.save(updateCustomer);
		}
		throw new CustomerNotFoundException("Deposit Not Possible for Not Existing Customer >>> "+customer.getCustomerNumber());
	}

}
