package com.MyLab.passByValueAndReference;

public class C {

	public void swapNumbers(Integer a, Integer b) {
		Integer temp = a;
		a = b;
		b = temp;
		System.out.println("Inside class C: "+a+" "+b);
	}
	
}
