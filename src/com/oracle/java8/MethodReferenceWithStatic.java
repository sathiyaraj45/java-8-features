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

interface HomeInterfaceSecond {
	int kitchenRoomSize(int roomLength, int roomWidth);
}

public class MethodReferenceWithStatic {
	//Personal kitchen service 
	public static void myKitchen() {
		System.out.println("It's my new kitchen design by David");
	}
	
	// Calculate kitchen area square feet
	public static int areaOfKitchen(int l, int w)
	{
		return l * w;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// My personal kitchen mapping to home kitchen interface using static method reference 
		HomeInterface home = MethodReferenceWithStatic::myKitchen;
		HomeInterfaceSecond homeTwo = MethodReferenceWithStatic::areaOfKitchen;
		
		//Now call the interface kitchen
		home.kitchen();
		
		//Area of Home
		int areaOfRoomSize = homeTwo.kitchenRoomSize(10, 10);
		System.out.println("Room Square feet ==> "+ areaOfRoomSize + "sqrt");
	}

}
