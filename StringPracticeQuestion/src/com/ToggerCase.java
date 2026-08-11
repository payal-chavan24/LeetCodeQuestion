package com;

public class ToggerCase {
public static void main(String[] args) {
//	Input:
//		JaVa
//
//		Output:
//		jAvA
	String str="JaVa";
	String newString="";
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch>='a'&&ch<='z') {
			newString=newString+(char)(ch-32);
		}else if(ch>='A'&&ch<='Z') {
			newString=newString+(char)(ch+32);
		}
	}
	System.out.println(newString);
	
}
}
