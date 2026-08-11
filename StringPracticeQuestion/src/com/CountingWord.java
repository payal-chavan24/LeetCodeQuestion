package com;

public class CountingWord {
public static void main(String[] args) {
//	Input:
//		Java is easy to learn
//
//		Output:
//		5
	String str="Java is easy to learn";
	int word=1;;
	
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==' ') {
			word++;
		}
	}
	System.out.println(word);
}
}
