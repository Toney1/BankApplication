package com.cybrilla.repository;

import org.springframework.data.repository.CrudRepository;

import com.cybrilla.entity.Transaction;

public interface TransactionRepository extends CrudRepository<Transaction, Integer>
{

}
