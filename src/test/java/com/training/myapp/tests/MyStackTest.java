package com.training.myapp.tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.myapp.MyStack;
import com.training.myapp.exception.EmptyMyStackException;

public class MyStackTest {
	
	private MyStack<String> stack;
	
	@Before
	public void setUp( ) {
		stack = new MyStack<>();
	}
	
	@After
	public void tearDown() {
		stack = null;
	}
	
	@Test
	public void testPushOperationThatChangesSizeOfStackByOne() {
		stack.push("One");
		stack.push("Two");
		stack.push("Three");
		assertEquals(3, stack.size());
	}
	
	@Test
	public void testPopOperationThatChangesSizeOfStackByOneAndReturnsTopMostElement() throws EmptyMyStackException {
		stack.push("One");
		stack.push("Two");
		stack.push("Three");
		assertEquals("Three", stack.pop());
		assertEquals(2, stack.size());
	}
	
	@Test(expected = EmptyMyStackException.class)
	public void testPopOperationOnEmptyStackThrowsException() throws EmptyMyStackException {
		stack.pop();
	}
	
	@Test
	public void testPeekOperationReturnsTopMostObjectValueWithoutRemovingIt() throws EmptyMyStackException {
		stack.push("One");
		stack.push("Two");
		stack.push("Three");
		assertEquals("Three", stack.peek());
		assertEquals(3, stack.size());
	}
	
	@Test(expected = EmptyMyStackException.class)
	public void testPeekOperationOnEmptyStackThrowsException() throws EmptyMyStackException {
		stack.peek();
	}
}











