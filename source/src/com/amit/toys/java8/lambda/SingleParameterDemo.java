package com.amit.toys.java8.lambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import com.amit.toys.java8.lambda.fi.SquareGenerator;

public class SingleParameterDemo {

	SquareGenerator squareClassic = new SquareGenerator(){

		@Override
		public int square(int input) {
			return input * input;
		}
		
	};
	
	
	SquareGenerator squareLambda1 = (int a) -> { return a*a ; };
	
	/** no need to have parameter type */
	SquareGenerator squareLambda2 = (a) -> { return a*a ; };
	
	/** no need to have parameter brackets also */
	SquareGenerator squareLambda3 = a -> { return a*a ; };
	
	/** no need to curly brackets, return and semicolon also */
	SquareGenerator squareLambda4 = a ->   a*a  ;
	
	
	
	public static void main(String[] args) {
		SingleParameterDemo singlePrameterDemo = new SingleParameterDemo();
		
		int resultClassic = singlePrameterDemo.squareClassic.square(2);
		System.out.println("Classic : " + resultClassic);
		
		System.out.println("Lambda 1: " + singlePrameterDemo.squareLambda1.square(2));
		System.out.println("Lambda 2: " + singlePrameterDemo.squareLambda2.square(2));
		System.out.println("Lambda 3: " + singlePrameterDemo.squareLambda3.square(2));
		System.out.println("Lambda 4: " + singlePrameterDemo.squareLambda4.square(2));
		
		//it so simple that we can write inline lambda
		System.out.println("Lambda -inline : " +  ((SquareGenerator)a ->   a*a).square(2));
		
		
		
		
		
		
	}
}
