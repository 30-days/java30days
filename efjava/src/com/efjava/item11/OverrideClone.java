/**
 * Item 11: override clone judiciously 
 * 
 * Because of its many shortcomings, some
 * expert programmers simply choose never 
 * to override the clone method and never
 * to invoke it except, perhaps, to copy 
 * arrays.
 * 
 * If you design a class for inheritance,
 * be aware that if you choose not to 
 * provide a well-behaved protected clone
 * method, it will be impossible for 
 * subclasses to implement Cloneable.
 * 
 */

package com.efjava.item11;

public class OverrideClone {

}
