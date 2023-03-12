package com.MyLab.passByValueAndReference;

public class PrepBytes {

	int data = 10;
	
	public void addNumberOne(PrepBytes p) {
		p.data = p.data +1;
		System.out.println("Inside prepbytes: "+ p.data);
	}
	
	public void addNumberViaIntegerWrapperClass(Integer num) {
		this.data = this.data + num;
		System.out.println("Inside prepbytes using 'Integer:' "+ this.data);
	}
	
	public void addNumberViaIntPrimitive(Integer num) {
		this.data = this.data + num;
		System.out.println("Inside prepbytes using 'Int primitive:' "+ this.data);
	}
}
