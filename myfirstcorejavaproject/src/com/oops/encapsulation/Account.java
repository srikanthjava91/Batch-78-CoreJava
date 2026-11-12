package com.oops.encapsulation;

//POJO : Plain Old Java Object 
//DTO : Data Transfer Object 
//Model : Data Model 
public class Account {

	private long accountNumber;
	private double balance;
	private String name;
	
	
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", name=" + name + "]";
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(long accountNumber, double balance, String name) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
