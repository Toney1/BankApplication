package com.cybrilla.repository;

import org.springframework.data.repository.CrudRepository;

import com.cybrilla.entity.BankCustomer;

public interface BankRepository extends CrudRepository<BankCustomer, Integer>
{
	
}
