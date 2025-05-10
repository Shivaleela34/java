package com.techmaster.javabasics;

public class Unaryincrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		a++;//10++ post-increment(execute first than increase ) by 1 value become 11
		System.out.println(a);//11
		++a;//12 pre-increment(11+1=12)
		System.out.println(a);//12
		System.out.println(a++);//12++
		a++;//13++
		System.out.println(a);//14
		++a;//15
		System.out.println(a);//15
		a++;//15++
		System.out.println(a);//16
		System.out.println(a++);//16++

		System.out.println(a++);//17++
		System.out.println(a);//18



	}

}
