package com.StringQuestions;

public class Main {

	public static void main(String[] args) {

				//String questions
				String s1 = "Afzhal";
				String s2 = "Afzhal";
				String s3 = new String("Afzhal");
				System.out.println(s1==s2); //exp- true
				System.out.println(s2==s3); //exp- false
				System.out.println(s1.equals(s2)); //exp- true
				System.out.println(s2.equals(s3)); //exp- true
	}

}
