package com.MyLab.methodOverLoading;

public class Main {

	public static void main(String[] args) {

		//Method overloading questions
		//Case1
		A a2 = new B();
		B b1 = (B)a2;
		b1.helloWord(); //exp- B //ans- B
		
		//Case2
		A a = new C();
		B b = (B)a;
		A a1 = (A)a;
		a1.helloWord(); //exp- C //ans- C
		
		//Case3
		A a3 = new B();
		((B)a3).BnativeMethod(); //exp- B's native method //ans- same correct exp
		
		
	}

}
