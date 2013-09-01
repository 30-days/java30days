/**
 * Item 6: Eliminate obsolete object references
 * 
 * Sources:
 * 	1. whenever a class manages its own memory, 
 * 	   the programmer should be alert for memory 
 *	   leaks.
 *	2. Caches
 *	3. Callback
 *
 * Solutions:
 * 	1. Nulling out the references
 * 	2. Use WeakHashMap
 */

package com.efjava.item6;

import java.util.Arrays;

public class MemoryLeak {
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public MemoryLeak() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}
	
	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}
	
	public Object pop() throws Exception {
		if (size == 0)
			throw new Exception();
		return elements[--size]; //memory leak.
		/**
		 * fix:
		 * 	Object result = elements[--size];
		 *  elements[size] = null;
		 *  return result;
		 */
	}
	
	/**
	* Ensure space for at least one more element, roughly
	* doubling the capacity each time the array needs to grow.
	*/
	private void ensureCapacity() {
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}
}
