/**
 * Item 12: Consider implementing Comparable
 */

package com.efjava.item12;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class ImplComparable {
	public static void main(String[] args) {
		Set<String> ss = new TreeSet<String>();
		String[] sa = {"a", "d", "B", "b", "c", "A", "D", "C"};
		Collections.addAll(ss, sa);
		System.out.println(ss);
		
		System.out.println(Double.compare(1.0, 1.1));
		System.out.println(1.0<1.1);
	}
}
