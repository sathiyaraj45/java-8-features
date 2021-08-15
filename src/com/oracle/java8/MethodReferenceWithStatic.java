/**
 * 
 */
package com.oracle.java8;

/**
 *
 * File Name: MethodReferenceWithStatic.java
 * @author Sathiyaraj <sathiyaraj45@gmail.com>
 * Created on 15 Aug, 2021
 *
 * TODO
 *
 */
//Home interface alone with kitchen method
interface HomeInterface {
	void kitchen();
}

public class MethodReferenceWithStatic {
	//Personal kitchen service 
	public static void myKitchen() {
		System.out.println("It's my new kitchen design by David");
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// My personal kitchen mapping to home kitchen interface using static method reference 
		HomeInterface home = MethodReferenceWithStatic::myKitchen;
		
		//Now call the interface kitchen
		home.kitchen();
		
	}

}
