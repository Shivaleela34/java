package com.techmaster.javabasics;

public class RelationalTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=88, n2=39, n3=1234, n4=5678;
		String equalCheck = (n1==n2) ? "n1 is equal to n2" : "n1 is not equal to n2";
		String notequalCheck = (n3!=n4) ? "n3 is not equal to n4" : "n3 is  equal to n4";
		String lessThanCheck = (n2<n3) ? "n2 is less than  n3" : "n2 is not less than  n3";
		String greaterThanCheck = (n4>n1) ? "n4 is greater than  n1" : "n4 is not greater than  n1";
		String greaterThanOrEqualCheck = (n3>=n1) ? "n3 is greater than or equal to n1" : "n3 is less than  n1";
		String lessThanOrEqualCheck = (n2<=n4) ? "n2 is less than or equal to n4" : "n2 is greater than n4";
		
		System.out.println(equalCheck);
		System.out.println(notequalCheck);
		System.out.println(lessThanCheck);
		System.out.println(greaterThanCheck);
		System.out.println(greaterThanOrEqualCheck);
		System.out.println(lessThanOrEqualCheck);



	}

}
