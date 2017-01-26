package com.amit.toys.java8.lambda.fi;


@FunctionalInterface
public interface SquareGenerator {

	int square (int input);
	
	/*
	 * uncomment below and LambdaMathDemo will have compilation error as Lambda
	 * can work with only functional interface.
	 */
	//int anoherMethod(int a);
}
