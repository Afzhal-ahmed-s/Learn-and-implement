package com.MyLab.passByValueAndReference;

public class B {

	public void swapNumbers(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Inside class B: "+ a+" "+b);
	}
	
}