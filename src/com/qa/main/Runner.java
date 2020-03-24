package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		Q1_SumCalculator sumCalculator = new Q1_SumCalculator();
		System.out.println(sumCalculator.add(3,7));
		
		Q5_Calculator calculator = new Q5_Calculator();
		System.out.println(calculator.divide(3,7));
		
		Q6_Calculator2 calculator2 = new Q6_Calculator2();
		System.out.println(calculator2.divide(3,7));
		//identical to Q5 as I used doubles to begin with.
		Q7_DivideByZero calculator3 = new Q7_DivideByZero();
		System.out.println(calculator3.divide(3,0));
		//infinity still appears as output. This could be prevented by including the conditional into the runner application, rather than the Q7_DivideByZero class.

	}

}
