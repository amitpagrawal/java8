package com.amit.toys.java8.lambda;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import com.amit.toys.java8.bo.Person;

public class BuiltInFunctionalInterfaceDemo {

	public static void main(String[] args) {
	
		
		UnaryOperator<Integer> square = a -> a*a ;
		System.out.println("square : " +  square.apply(2));
		
		
		BinaryOperator<Integer> sum = (a,b) -> a+b;
		System.out.println("sum : " +  sum.apply(2,3));
		
		
		Function<Integer,Double> mileTokilo = x -> x * 1.165;
		System.out.println("into Mile " + mileTokilo.apply(2));
		
		/*same idea can be extended to objects */
		
		Function<List<Person>,Double> averageAge = p -> {
			
			Double avgAge = 0.0;
			System.out.println(p);
			int totalAge =0;
			for (Person per : p) {
				totalAge = totalAge + per.getAge();
			}
			
			avgAge = (double) (totalAge / p.size());
			return avgAge;
		};
		
		
		
		
		System.out.println("Person average" + averageAge.apply(Person.dummyList()));
			
	}
	
	
}
