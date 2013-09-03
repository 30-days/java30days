/**
 * Item 10: Always override toString
 * 
 * providing a good toString implementation makes 
 * your class much more pleasant to use.
 * 
 * When practical, the toString method should return 
 * all of the interesting information contained in 
 * the object.
 * 
 * 
 */
package com.efjava.item10;

import java.math.BigInteger;


public class OverrideToString {

	@Override
	public String toString() {
		return "[Object of " + getClass().getName() + "]";
	}

	public static void main(String[] args) {
		System.out.println(new OverrideToString());
		
		BigInteger bi = new BigInteger("123938472394820384230984");
		
		System.out.println(bi);
		
	}
	
}
