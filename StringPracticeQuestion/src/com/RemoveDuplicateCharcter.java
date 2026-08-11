package com;

public class RemoveDuplicateCharcter {
public static void main(String[] args) {
//	Input:
//		programming
//
//		Output:
//		progamin
	String str="programming";
	for(int i=0;i<str.length();i++) {
		boolean isDuplicate=false;
		for(int j=0;j<i;j++) {
			if(str.charAt(i)==str.charAt(j)) {
				isDuplicate=true;
			}
		}
		if(!isDuplicate) {
			System.out.print(str.charAt(i));
		}
		
	}
}
}
