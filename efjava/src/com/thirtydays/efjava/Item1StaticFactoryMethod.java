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
 *	3. Unlike constructors, they can return an object of any sub-type
 *	   of their return type.
 *			- Hide the implementation of the classes
 *			- item18: interface based framework
 *			- java.util.Collections for 32 implementations
 *			- item32: java.util.EnumSet returns one of two implementations
 *			- Basis of Service Provider Frameworks
 *  4. Reduce the verbosity of creating parameterized type instances.
 *  		- Map<String, List<String>> m = new HashMap<String, List<String>>();
 *  		-> Map<String, List<String>> m = HashMap.newInstance();
 *  		with the assumed method (not built in 1.6):
 *  		public static <K, V> HashMap<K, V> newInstance() {
 *  			return new HashMap<K, V>();
 *  		}
 *  		
 */

package com.thirtydays.efjava;

public class Item1StaticFactoryMethod {

}
