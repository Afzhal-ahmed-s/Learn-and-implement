package com.methodOverLoading;

public class Main {

	public static void main(String[] args) {

		//Method overloading questions
		A a = new C();
		B b = (B)a;
		A a1 = (A)a;
		a1.helloWord();
		
	}

}
