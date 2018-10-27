package com.cybrilla.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BankCustomer 
{
		@Id 
		@GeneratedValue
		private int customerNumber;
		@Column
		private String customerName;
		@Column
		private int age;
		@Column
		private String accountType;
		@Column
		private int balance;
		
		
		
		
		public String getAccountType() {
			return accountType;
		}
		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		public int getCustomerNumber() {
			return customerNumber;
		}
		public void setCustomerNumber(int customerNumber) {
			this.customerNumber = customerNumber;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() 
		{
			return "CNumber:: "+this.customerNumber+" CName :: "+this.customerName;
		}
}
