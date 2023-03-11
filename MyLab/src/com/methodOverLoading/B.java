package com.methodOverLoading;

public class B extends A{

	@Override
	public void helloWord() {
		System.out.println("In class B printing hello world");
	}
	
	public void BnativeMethod() {
		System.out.println("B native method");
	}
}
