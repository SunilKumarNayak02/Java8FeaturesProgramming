package org.sun.development;

public class Example2  implements Test{

	@Override
	public void display() {
		
	}
	
	@Override
	public void substract() {
		// Every time i did not this i want overridden the method() 
		System.out.println("Subtract () in Example2 Class");
	}
	
	//i want Interface Default method
	public void utility() {
		Test.super.substract();
	}
	
	public static void main(String[] args) {
		Example2 e2=new Example2();
		e2.substract();
		e2.utility();
	}

}
