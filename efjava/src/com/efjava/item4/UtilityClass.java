/**
 * Item 4:Enforce noninstantiability with a private constructor
 * 
 * private assertion constructor guarantee the class
 * is not instantiable and can not be subclassed.
 * 
 * usage:
 * 	java.util.Math
 *  java.util.Arrays
 *  java.util.Cllections //static method factories
 * 
 */

package com.efjava.item4;

public class UtilityClass {
	private UtilityClass() {
		throw new AssertionError();
	}
}
