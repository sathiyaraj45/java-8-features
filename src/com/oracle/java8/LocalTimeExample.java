/**
 * 
 */
package com.oracle.java8;

import java.time.Clock;
import java.time.LocalTime;

/**
 *
 * File Name: LocalTimeExample.java
 * @author Sathiyaraj <sathiyaraj45@gmail.com>
 * Created on 2 Aug, 2021
 *
 * TODO
 *
 */

public class LocalTimeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare the time variable 
		LocalTime localTimeFirst = null;
		// Declare the variable and assign the value 
		LocalTime localTimeSecond = LocalTime.now();
		//Assign the current time value
		localTimeFirst = LocalTime.now(Clock.systemDefaultZone());
		
		//Print the time variables
		System.out.println("First local time value");
		System.out.println(localTimeFirst);
		System.out.println("Second local time value");
		System.out.println(localTimeSecond);
		System.out.println("First variable hours");
		System.out.println(localTimeFirst.getHour());
		System.out.println("First variable mintues");
		System.out.println(localTimeFirst.getMinute());
		System.out.println("Frist variable seconds");
		System.out.println(localTimeFirst.getSecond());
		System.out.println("Second variable nano seconds");
		System.out.println(localTimeFirst.getNano());
	}

}
