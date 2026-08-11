package com;

public class ReverseOrder {
public static void main(String[] args) {
//	Input:
//		Java Full Stack
//
//		Output:
//		Stack Full Java
	String str="Java Full Stack";
	for(int i=str.length()-1;i>=0;i--) {
		if(str.charAt(i)==' ') {
			for(int j=i+1;j<str.length()&&str.charAt(j)!=' ';j++) {
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}
	}
	for(int i=0;i<str.length()&&str.charAt(i)!=' ';i++) {
		System.out.print(str.charAt(i));
	}
		
}
}
