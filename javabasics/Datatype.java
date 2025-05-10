package com.techmaster.javabasics;

public class Datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//integer family
		int c=2147483647; //which can range up to 2147483647-4 bytes
		System.out.println(c);
		long d=2147483647; //which can range up to 2147483647-8 bytes
		System.out.println(d);
		//decimal family
		double number=32.34; //always take decimal value in double-8 bytes
		System.out.println(number);
		float num2=76889111112222233333444445555566666777.44f;// 39 digits it will take
		System.out.println(num2);
		float num=33.46788888888877777655464773f; //by default it take double value and convert float-4 bytes
		System.out.println(num);
		int num1=(int) 32.35; //casting converting 32.36 into integer
		System.out.println(num1);
		//Non-numeric data type
		char letters='A'; // char can take only one letter-2 byte
		char letterss='a';
		System.out.println(letters);
		System.out.println(letterss);
		String str="SHIVALEELA"; //string can be used for words
		System.out.println(str + "lets take a break");
		boolean statement=true;
		System.out.println(statement);
		
		

	}

}
