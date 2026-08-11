package com;

public class ReverseStrings {
public static void main(String[] args) {
	String str="java";
	String newString="";
	for(int i=str.length()-1;i>=0;i--) {
		newString=newString+str.charAt(i);
	}
	System.out.println("New String ="+newString);
	
}
}
