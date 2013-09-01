/**
 * Item 3: Enforce the singleton property with a private
 * 		   constructor or an enum type.
 */

package com.efjava.item3;

import java.io.Serializable;

public class Singletons {
	
	/**
	 * Singleton pattern public field.
	 * 
	 * could be attacked by privileged client by:
	 * 	invoking the private constructor reflectively
	 * 	with aid of the AccessibleObject.setAccessible
	 * 
	 * to avoid the attack, raising a exception if someone
	 * tries to create a second instance.
	 *
	 */
	public static class PublicStaticFieldSingleton {
		public static final PublicStaticFieldSingleton INSTANCE = new PublicStaticFieldSingleton();
		
		private String name = PublicStaticFieldSingleton.class.getName();
		
		private PublicStaticFieldSingleton () {};

		public String getName() {
			return name;
		};
	};
		
	/**
	 * Singleton pattern private field.
	 * 
	 * More flexible than the previous one.
	 * 
	 * Easy to change if multiple instance is required in the future.
	 * 
	 * To make it "serializable" (applicable to the previous case):
	 * 	implement the Serializable interface
	 *  declare all instance fields "transient"
	 *  provide readResolve method
	 *
	 */
	public static class PrivateStaticFieldSingleton implements Serializable{

		private static final long serialVersionUID = 1L;

		public Object readResolve() {
			return INSTANCE;
		}
		
		private static final PrivateStaticFieldSingleton INSTANCE = new PrivateStaticFieldSingleton();
		
		private String name = PrivateStaticFieldSingleton.class.getName();
		
		private PrivateStaticFieldSingleton () {};
		
		public static PrivateStaticFieldSingleton getInstance() {
			return INSTANCE;
		};
		
		public String getName() {
			return name;
		};
	};
	
	/**
	 * a single-element enum type is the best way to implement a singleton!
	 * 
	 */
	public enum EnumSingleton {
		INSTANCE;
		
		private String name = EnumSingleton.class.getName();

		public String getName() {
			return name;
		}
	}
}
