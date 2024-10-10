package org.sun.development;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example1 implements Test{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
	public void abc() {
		//Access The default method
	  Test.super.substract();
	}
	public static void main(String[] args) {
		Example1 e1=new Example1();
		e1.abc();	
		//call the static method it is redefing the method not overriding
		Test.add();
		
	}
	
		
	}

	


