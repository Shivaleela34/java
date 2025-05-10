package com.techmaster.javabasics;

public class Unarydecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		a--;//10-- post-decrement(execute first than increase )
		System.out.println(a);//9
		--a;//8 pre-decrement(9-1=8)
		System.out.println(a);//8
		System.out.println(a--);//8--
		System.out.println(a--);//7--

		System.out.println(a--);//6--
		System.out.println(a);//5


	}

}
