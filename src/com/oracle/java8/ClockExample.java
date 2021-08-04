/**
 * 
 */
package com.oracle.java8;

import java.time.Clock;

/**
 *
 * File Name: ClockExample.java
 * @author Sathiyaraj <sathiyaraj45@gmail.com>
 * Created on 3 Aug, 2021
 *
 * TODO
 *
 */

public class ClockExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create clock variable and initialize null value
		Clock clock = null;
		
		//Initialize system default time zone
		clock = Clock.systemUTC();
		//Find the zone 
		System.out.println(clock.getZone());
		//Find the hash code
		System.out.println(clock.hashCode());
		//Find the current instance
		System.out.println(clock.instant());
		//Find milliseconds from the instance
		System.out.println(clock.millis());
		
	}

}
