/**
 * 
 */
package com.oracle.java8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * File Name: LambdaExample.java
 * @author Sathiyaraj <sathiyaraj45@gmail.com>
 * Created on 9 Aug, 2021
 *
 * TODO
 *
 */

public class LambdaExample {
	public static void main(String[] args) {
		Person p1 = new Person("sathiyaraj", "sathiyaraj45@gmail.com", "+919244414449", LocalDate.of(1988, 7, 3), Person.Sex.MALE);
		Person p2 = new Person("Tejashree", "tejashree@gmail.com", "+919244414449", LocalDate.of(2020, 1, 19), Person.Sex.FEMALE);
		List<Person> personList = new ArrayList<Person>();
		personList.add(p1);
		personList.add(p2);
		printOlderPerson(personList, 30);
		
	}
	
	private static void printOlderPerson(List<Person> persons, int age) {
		for(Person p : persons) {
			if( p.getAge() > age) {
				p.personDetails();
				System.out.println();
			}
		}
	}
}
