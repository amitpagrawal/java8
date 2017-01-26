package com.amit.toys.java8.lambda.fi;

/*
 * This is example of functional interface. 
 */
@FunctionalInterface
public interface MathOperation {

	int operate(int a, int b);

	/*
	 * uncomment below and LambdaMathDemo will have compilation error as Lambda
	 * can work with only functional interface.
	 */
	//int anoherMethod(int a);
}
