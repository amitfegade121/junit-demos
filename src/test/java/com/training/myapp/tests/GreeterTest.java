package com.training.myapp.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.myapp.Greeter;

public class GreeterTest {
	
	@Test
	public void testGreetThatReturnsHelloWorld() {
		Greeter greeter = new Greeter();
		assertEquals("Hello World", greeter.greet());
	}
}
