package com.cybrilla.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Transaction 
{
	@Id
	@GeneratedValue
	private int transactionId;
	@Column
	private int fromAccountNumber;
	@Column
	private int toAccountNumber;
	@Column
	private int amount;
	@Column
	private Date TransactionDate;
	
	
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public Date getTransactionDate() {
		return TransactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		TransactionDate = transactionDate;
	}
	public int getFromAccountNumber() {
		return fromAccountNumber;
	}
	public void setFromAccountNumber(int fromAccountNumber) {
		this.fromAccountNumber = fromAccountNumber;
	}
	public int getToAccountNumber() {
		return toAccountNumber;
	}
	public void setToAccountNumber(int toAccountNumber) {
		this.toAccountNumber = toAccountNumber;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	

}
