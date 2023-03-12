package com.MyLab.passByValueAndReference;

public class A {

	int data = 100;
	
	public void change(int num) {
		this.data += num;
	}
	
	public void printData() {
		System.out.println(this.data);
	}
	
}
