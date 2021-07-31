/**
 * 
 */
package com.oracle.java8;

import java.time.LocalDate;

/**
 *
 * File Name: LocalDateExample.java
 * @author Sathiyaraj <sathiyaraj45@gmail.com>
 * Created on 31 Jul, 2021
 *
 * TODO
 *
 */

public class LocalDateExample {
	static public void main(String[] args) {
		// Defined local date variable
		LocalDate localDate = null;
		
		// Assign local local date
		localDate= LocalDate.now();
		// Basic date information
		System.out.println("Number of days we reached this year");
		System.out.println(localDate.getDayOfYear());
		System.out.println("What is the day of month");
		System.out.println(localDate.getDayOfMonth());
		System.out.println("What is the month of Year");
		System.out.println(localDate.getMonthValue());
		System.out.println("What is the year");
		System.out.println(localDate.getYear());
	}
}
