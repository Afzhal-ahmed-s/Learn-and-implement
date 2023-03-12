package com.MyLab.passByValueAndReference;

public class Main {

	public static void main(String[] args) {

		A a1 = new A();
		a1.printData();
		a1.change(25);
		a1.printData();
		System.out.println();
		
		int a=1; int b=2;
		System.out.println("Before: "+a+" "+b);
		B b1 = new B();
		b1.swapNumbers(a, b);
		System.out.println("After: "+a+" "+b);
		System.out.println();
		
		Integer a2= 1; Integer b2= 2;
		C c = new C();
		System.out.println("Before: "+a2+" "+b2);
		c.swapNumbers(a2, b2);
		System.out.println("After: "+a2+" "+b2);
		System.out.println();

		PrepBytes p1 = new PrepBytes();
		System.out.println("Before: "+p1.data);
		p1.addNumberOne(p1);
		System.out.println("After: "+p1.data);
		
		Integer num = 1;
		p1.addNumberViaIntegerWrapperClass(num);
		System.out.println(p1.data);
		int num2 = 2;
		p1.addNumberViaIntPrimitive(num2);
		System.out.println(p1.data);

		A a3 = new A();
		a3.change(22);
		A a4 = new A();
		System.out.println("Before: "+a3.data+" "+a4.data);
		swap(a3,a4);
		System.out.println("After: "+a3.data+" "+a4.data);
		System.out.println();
		
		A a5 = new A();
		a5.change(33);
		A a6 = new A();
		System.out.println("Before: "+a5.data+" "+a6.data);
		swap2(a5,a6);
		System.out.println("After: "+a5.data+" "+a6.data);
		
		
	}
	
	public static void swap(A a1, A a2) {
		A temp = a1;
		a1 = a2;
		a2 = temp;
		System.out.println("Inside main swap: "+ a1.data+" "+a2.data);
	}
	
	public static void swap2(A a1, A a2) {
		Integer temp = a1.data;
		a1.data = a2.data;
		a2.data = temp;
		System.out.println("Inside main swap: "+ a1.data+" "+a2.data);
	}

}
