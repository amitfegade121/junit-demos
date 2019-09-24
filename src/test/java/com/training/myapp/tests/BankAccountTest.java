package com.training.myapp.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.myapp.BankAccount;
import com.training.myapp.exception.LowBalanceException;

public class BankAccountTest {
	
	private BankAccount account;
	
	@Before
	public void setUp() {
		account = new BankAccount(101, "John Doe", "SAVING", 45000, true);
	}
	
	@After
	public void tearDown() {
		account = null;
	}

	@Test
	public void testBankAccountObjectIsNotNull() {
		assertNotNull(account);
	}

	@Test
	public void testBankAccountStatusIsActive() {
		assertTrue(account.isAccountStatus());
	}
	
	@Test
	public void testBankAccountBalance() {
		assertEquals(45000, account.getAccountBalance(), 0.02);
	}
	
	@Test
	public void testDepositOperation() {
		double newBalance = account.deposit(4555.67);
		assertEquals(49555.69, newBalance, 0.03);
	}
	
	@Test
	public void testWithdrawOperationWithSuccess() throws LowBalanceException {
		double newBalance = account.withdraw(2000);
		assertEquals(43000, newBalance, 0.03);
	}
	
	@Test(expected = LowBalanceException.class)
	public void testWithdrawOperationWithInsufficientBalance() throws LowBalanceException {
		account.withdraw(47000);
	}
	
	
}








