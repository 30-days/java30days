/**
 * item1: Consider static factory methods instead of constructors
 * 
 * Advantages:
 * 	1. Unlike constructors, they have name. 
 * 		* better readability.
 * 		* same signature for different purpose
 *	2. Unlike constructors, they are not required to create a new 
 *	   object each time invoked. Allow strict control of instance
 *	   creation.
 *		* examples:
 *			- Boolean.valueOf(boolean)
 *			- item15: controlled/cached instances of immutable classes
 *			- item3: singleton
 *			- item4: noninstantiable
 *		* similar to FlyWeight design pattern
 *	3. Unlike constructors, they can return an object of any subtype
 *	   of their return type.
 *			- Hide the implementation of the classes
 *			- item18: interface based framework
 */

package com.thirtydays.efjava;

public class Item1StaticFactoryMethod {

}
