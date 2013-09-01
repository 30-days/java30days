/**
 * Item 2: Consider a builder when faced with many constructor parameters
 *		
 *		Builder pattern
 *
 *		static nested class is perfect builder.
 *
 *		README object is immutable / thread safe.
 *
 *		Builder should check if the value is invariant. If not, throw
 *		IllegalStateException.
 *
 *		The Builder pattern is a good choice when designing classes 
 *		whose constructors or static factories would have more than 
 *		a handful of parameters, especially if most of those parameters 
 *		are optional.
 *
 */

package com.efjava.item2;

import java.util.Date;

public class BuilderPattern {
	private String title;
	private String auther;
	private Date published;
	private String location;
	private Integer pageno;
	
	public static class Builder {
		// mandatory
		private String title;
		private String auther;
		
		// optional
		private Date published = new Date();
		private String location = "";
		private Integer pageno = 1;
		
		public Builder(String tilte, String auther) {
			this.title = tilte;
			this.auther = auther;
		}

		public Builder location(String location) {
			this.location = location;
			return this;
		}

		public Builder published(Date published) {
			this.published = published;
			return this;
		}

		public Builder pageno(Integer pageno) {
			this.pageno = pageno;
			return this;
		}
		
		public BuilderPattern build() {
			return new BuilderPattern(this);
		}
	}
	
	private BuilderPattern(Builder builder) {
		this.title = builder.title;
		this.auther = builder.auther;
		this.location = builder.location;
		this.published = builder.published;
		this.pageno = builder.pageno;
	}
	
	public static int globalValue = 0;
	
	public int val() {
		return globalValue;
	}
	
	public int val(int v) {
		globalValue = v;
		return globalValue;
	}
	
	public static void main( String[] args ) {
		System.out.println("Hello item2!");
		
		BuilderPattern bp = new BuilderPattern.Builder("Readme of item2", "2nd day")
							.location("Toronto")
							.pageno(80)
							.build();
		System.out.println(bp.val(99));
		System.out.println(bp.val());
	}
}
