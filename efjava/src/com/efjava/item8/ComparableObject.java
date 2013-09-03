/**
 * Item 8: Obey the general contract when overriding equals.
 * 
 * When is it appropriate to override Object.equals?
 * 		- value class
 * 
 * The equals method implements an equivalence relationship. It is:
 * 	1. Reflexive: x.equals(x) must return true.
 * 	2. Symmetric: x.equals(y) = y.equals(x)
 * 	3. Transitive: x.equals(y) and y.equals(z) are true => x.equals(z) is true
 * 	4. Consistent: if no change on x or y, multiple calls of x.equals(y) return 
 * 	   same results.
 * 	5. x.equals(null) must return false
 * 
 * High quality equals method:
 * 	1. Use '==' operator to check if the argument is a reference of this object
 * 	2. Use 'instanceof' to check if the argument has correct type
 * 	3. Cast the argument to correct type
 * 	4. Check the significant fields are equal.
 * 			- use Float.compare and Double.compare
 * 			- use Arrays.equals
 * 	5. Rethink symmetic, transitive and consistent
 * 
 * * Always override hashCode when you override equals.
 * 
 */

package com.efjava.item8;

import java.util.HashMap;
import java.util.Map;

public class ComparableObject {
	public static class CmpPoint {
		private int x;
		private int y;
		public CmpPoint(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		@Override
		public boolean equals(Object obj) {
			if (obj == this) {
				return true;
			}
			if (!(obj instanceof CmpPoint)) {
				return false;
			}
			CmpPoint o = (CmpPoint) obj;
			return this.x==o.x && this.y==o.y;
		}
		@Override
		public int hashCode() {
			return x + y;
		}
		
	}
	
	public static void main(String[] args) {
		Map<CmpPoint, Integer> m = new HashMap<CmpPoint, Integer>();
		CmpPoint p = new CmpPoint(0,2);
		m.put(new CmpPoint(1,1), 1);
		m.put(new CmpPoint(0, 2), 2);
		m.put(new CmpPoint(2, 0), 3);
		System.out.println(m.get(p));
	}
}
