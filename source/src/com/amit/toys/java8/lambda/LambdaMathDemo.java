package com.amit.toys.java8.lambda;

import com.amit.toys.java8.lambda.fi.MathOperation;



public class LambdaMathDemo {
	
	/*
	 * lambda properties
	 * 1. does not return type
	 * 2. does not return for single statement
	 * 3. does not need curly braces for single statement
	 * 
	 */
	MathOperation additionLambda =  (a, b) ->  a + b ;
	
	/* all below are same */
	// MathOperation additionLambda2 =  (int a, int  b) ->  { return a + b; } ;
	// MathOperation additionLambda3 =  (int a, int  b) ->  {  a + b } ;
	
	MathOperation additionClassic = new MathOperation(){
		
			@Override
			public int operate (int a, int b)  {
			return a+b;
		}
	};

	
	
	
	
	public static void main(String[] args) {
		LambdaMathDemo snippet = new LambdaMathDemo();
		
		int resultClassic = snippet.additionClassic.operate(10, 20);
		System.out.println("Classic : " + resultClassic);
		
		int resultLambda = snippet.additionLambda.operate(10, 20);
		System.out.println("Lambda : " + resultLambda);
	}
	
}

