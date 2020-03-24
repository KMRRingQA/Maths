package com.qa.main;

public class Q7_DivideByZero {

	int add(int Number1, int Number2) {
		return Number1 + Number2;
	}
	int subtract(int Number1, int Number2) {
		return Number1 - Number2;
	}
	int multiply(int Number1, int Number2) {
		return Number1 * Number2;
	}
	double divide(double Number1, double Number2) {
		if (Number2==0) {
			System.out.println("You attempted dividing by zero.");
		}
		return Number1 / Number2;
	}

}
