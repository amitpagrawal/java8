package com.amit.toys.java8.bo;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	
	private int age;
	String name;

	public Person(String name, int age) {
		this.name = name;
		this.setAge(age);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + "( " + this.getAge() + ")";
	}

	public static List<Person> dummyList() {
		
		List<Person> dummyList = new ArrayList<Person> ();
		dummyList.add(new Person("Sita", 10));
		dummyList.add(new Person("Gita", 20));
		dummyList.add(new Person("Babita", 30));
		
		return dummyList;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
