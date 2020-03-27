package com.qa.main;

public class Q7_DivideByZero {

	int add(int number1, int number2) {
		return number1 + number2;
	}

	double divide(double number1, double number2) {
		if (number2 == 0) {
			System.out.println("You attempted dividing by zero.");
		}
		return number1 / number2;
	}

	int multiply(int number1, int number2) {
		return number1 * number2;
	}

	int subtract(int number1, int number2) {
		return number1 - number2;
	}

}
