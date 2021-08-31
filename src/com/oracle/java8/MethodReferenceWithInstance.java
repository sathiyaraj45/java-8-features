/**
 * 
 */
package com.oracle.java8;

/**
 *
 * File Name: MethodReferenceWithDynamic.java
 * @author Sathiyaraj <sathiyaraj45@gmail.com>
 * Created on 31 Aug, 2021
 *
 * TODO
 *
 */
interface Shop {
	void buy();
}

public class MethodReferenceWithInstance {
	public void buySummerKidsOffer() {
		System.out.println("The summer session is starting now so go and hurry up for your shopping.");
	}
	
	static public void main(String args[]) {
		MethodReferenceWithInstance methodRef = new MethodReferenceWithInstance();
		//Instance method reference
		Shop shop = methodRef::buySummerKidsOffer;
		//Calling the interface
		shop.buy();
		//Alternative way to instance reference
		Shop shop1 = new MethodReferenceWithInstance()::buySummerKidsOffer;
		//Calling the interface
		shop1.buy();
	}
	
}
