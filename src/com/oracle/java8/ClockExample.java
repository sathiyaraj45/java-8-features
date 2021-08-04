/**
 * 
 */
package com.oracle.java8;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;

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
		
		//Current System time mills
		System.out.println(System.currentTimeMillis());
		
		//Find Time zone id and print the details of time zone
		ZoneId zoneId = clock.getZone();
		System.out.println(zoneId);
		
		//Find Time zone
		ZonedDateTime zone = ZonedDateTime.now();
		System.out.println(zone.toString());
		
	}

}
