package com.training.myapp.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.myapp.EvenOdd;

public class EvenOddTest {

	@Test
	public void testNumberIsEven() {
		assertTrue(EvenOdd.checkNumber(6));
	}
	
	@Test
	public void testNumberIsOdd() {
		assertFalse(EvenOdd.checkNumber(5));
	}

}
