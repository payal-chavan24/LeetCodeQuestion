package com;

public class NonRepeated {
public static void main(String[] args) {
//	Input:
//		aabbcde
//
//		Output:
//		c
	String str="aabbcde";
	for(int i=0;i<str.length();i++) {
		boolean  isRepeated=false;
		for(int j=0;j<str.length();j++) {
			if(str.charAt(i)==str.charAt(j)&&i!=j) {
				isRepeated=true;
			}
		}
		if(!isRepeated) {
			System.out.println(str.charAt(i));
			return;
		}
	}
}
}
