package com;

public class FindFirstRepeatedWord {
public static void main(String[] args) {
//	nput:
//		abca
//
//		Output:
//		a
	String str="abca";
	for(int i=0;i<str.length();i++) {
		boolean isRepeated=false;
		for(int j=i+1;j<str.length();j++) {
			if(str.charAt(i)==str.charAt(j)) {
				isRepeated=true;
			}
		}
		if(isRepeated) {
			System.out.println(str.charAt(i));
			return;
		}
	}
}
}
