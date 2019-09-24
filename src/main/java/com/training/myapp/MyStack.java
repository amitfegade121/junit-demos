package com.training.myapp;

import java.util.LinkedList;

import com.training.myapp.exception.EmptyMyStackException;

public class MyStack<T> {
	
	private LinkedList<T> data = new LinkedList<>();

	public void push(T element) {
		data.addLast(element);
	}

	public int size() {
		return data.size();
	}

	public T pop() throws EmptyMyStackException {
		if(size() == 0)
			throw new EmptyMyStackException("Stack is empty.");
		else
			return data.removeLast();
	}

	public T peek() throws EmptyMyStackException {
		if(size() == 0)
			throw new EmptyMyStackException("Stack is empty.");
		else
			return data.getLast();
	}
	
	
}





