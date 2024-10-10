package org.sun.development;

public interface Test {
	//we can write default and static method in java 8 interface
	     //abstaract
	     public abstract void display();
	
	     //default 
	    default void substract() {
	           System. out.println("in side Test interface default method ") ;
	     }
	
	    //static
	    static void add() {
	     System. out. println("in add method") ;
	    }
	    
	
		/*
		 * private(in java 8 it is not possible in java 9 it should be possible)
		 * private void add1() {
		 
		 * }
		 */
	
	/*The default methods in java 8 interface will
	  * provide the backward compatiability

	  *We can write Default and static methods in java 8 interface
	
	  * default void show() { System.out.println("in show method"); 
	   * static void add() { System. out. println("in add method"); */
	
}
