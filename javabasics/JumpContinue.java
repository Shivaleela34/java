package com.techmaster.javabasics;

public class JumpContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			if(i==3) {
				continue;
			}
			System.out.println(i);
			
		}
		for(int i=1;i<=10;i++) {
			if(i==3) {
				break;
			}
			System.out.println(i);
		}

	}

}
