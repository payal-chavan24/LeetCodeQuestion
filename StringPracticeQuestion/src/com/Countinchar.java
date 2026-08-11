package com;

public class Countinchar {
public static void main(String[] args) {
//	Input:
//		Java@123
//
//		Output:
//		Upper = 1
//		Lower = 3
//		Digits = 3
//		Special = 1
	String str="Java@123";
	int upper=0;
	int lower=0;
	int digit=0;
	int special=0;
	
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch>='a'&&ch<='z') {
			lower++;
		}else if(ch>='A'&&ch<='Z') {
			upper++;
		}else if(ch>='0'&&ch<='9') {
			digit++;
		}else  {
			special++;
		}
	}
	System.out.println("lower ="+lower);
	System.out.println("upper ="+upper);
	System.out.println("digit ="+digit);
	System.out.println("special ="+	special);
}
}
