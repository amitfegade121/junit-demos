package com.training.myapp;

import com.training.myapp.exception.NegativeInputException;

public class Factorial {

	public static long calculateFactorial(int number) throws NegativeInputException {
		if(number < 0) {
			throw new NegativeInputException("Please provide positive number as input");
		}
		else {
			long result = 1;
			for(int i = 1; i <= number; i++) {
				result = result * i;
			}
			return result;
		}		
	}

}
