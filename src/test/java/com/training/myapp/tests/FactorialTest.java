package com.training.myapp.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.myapp.Factorial;
import com.training.myapp.exception.NegativeInputException;

public class FactorialTest {

	@Test
	public void testFactorialWithPositiveNumber() throws NegativeInputException {
		assertEquals(120, Factorial.calculateFactorial(5));
	}
	
	@Test
	public void testFactorialWithZeroAsInput() throws NegativeInputException {
		assertEquals(1, Factorial.calculateFactorial(0));
	}
	
	@Test(expected = NegativeInputException.class)
	public void testFactorialWithNegativeNumberAsInput() throws NegativeInputException {
		Factorial.calculateFactorial(-4);
	}

}







