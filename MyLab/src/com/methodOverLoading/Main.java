package com.methodOverLoading;

public class Main {

	public static void main(String[] args) {

		//Method overloading questions
		//Case1
		A a2 = new B();
		B b2 = (B)a2;
		B b1 = (B)a2;
		b1.helloWord(); //exp- A, B //ans- 
		
		//Case2
		A a = new C();
		B b = (B)a;
		A a1 = (A)a;
		a1.helloWord();
		
		//Case3
		A a3 = new B();
		((B)a3).BnativeMethod();;
		
		
	}

}
