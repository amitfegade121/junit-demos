package com.training.myapp;

import com.training.myapp.exception.LowBalanceException;

public class BankAccount {

	private int accountId;
	private String accountHolderName;
	private String accountType;
	private double accountBalance;
	private boolean accountStatus;

	public BankAccount(int accountId, String accountHolderName, String accountType, double accountBalance,
			boolean accountStatus) {
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
		this.accountStatus = accountStatus;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public boolean isAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(boolean accountStatus) {
		this.accountStatus = accountStatus;
	}

	public double deposit(double amount) {
		accountBalance = accountBalance + amount;
		return accountBalance;
	}

	public double withdraw(double amount) throws LowBalanceException  {
		if(accountBalance - amount >= 0) {
			accountBalance = accountBalance - amount;
			return accountBalance;
		}
		else
			throw new LowBalanceException("You don't have sufficient fund...");
	}

}










