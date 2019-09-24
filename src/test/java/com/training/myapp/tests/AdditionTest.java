package com.training.myapp.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.myapp.Addition;

public class AdditionTest {

	@Test
	public void testAdditionWithTwoPositiveNumbers() {
		assertEquals(17, Addition.addition(5, 12));
	}
	
	@Test
	public void testAdditionWithTwoNegativeNumbers() {
		assertEquals(-12, Addition.addition(-5, -7));
	}
	
	@Test
	public void testAdditionWithOnePositiveAndOneNegativeNumber() {
		assertEquals(5, Addition.addition(12, -7));	
	}

}






