package com;

public class DulicateCharcter {
public static void main(String[] args) {
//	Input:
//		programming
//
//		Output:
//		r
//		g
//		m
	String str="programming";
	for(int i=0;i<str.length();i++) {
	 boolean isDuplicate=false;
		for(int j=i+1;j<str.length();j++) {
			if(str.charAt(i)==str.charAt(j)) {
				isDuplicate=true;
			}
		}
		if(isDuplicate==true) {
			System.out.println(str.charAt(i));
		}
	}
		
}
}
