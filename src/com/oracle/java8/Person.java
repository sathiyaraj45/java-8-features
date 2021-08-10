/**
 * 
 */
package com.oracle.java8;

import java.time.LocalDate;

/**
 *
 * File Name: Person.java
 * @author Sathiyaraj <sathiyaraj45@gmail.com>
 * Created on 9 Aug, 2021
 *
 * TODO
 *
 */

public class Person {
	public enum Sex {
		MALE, FEMALE, TRANSGENDER
	}
	
	String name;
	String email;
	String phoneNumber;
	LocalDate dateOfBirth;
	Sex gender;
	
	
	
	/**
	 * @param name
	 * @param email
	 * @param phoneNumber
	 * @param dateOfBirth
	 * @param gender
	 */
	public Person(String name, String email, String phoneNumber, LocalDate dateOfBirth, Sex gender) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
	}

	public int getAge() {
		LocalDate todayDate = LocalDate.now();
		return todayDate.compareTo(dateOfBirth);
	}
	
	public void personDetails() {
		System.out.println("Name :"+ name);
		System.out.println("Email :"+ email);
		System.out.println("Phone :"+ phoneNumber);
		System.out.println("Date Of Birth :"+ dateOfBirth.toString());
		
	}
}
