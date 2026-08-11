package com;

public class ReplaceSpaceWithHypen {
public static void main(String[] args) {
//	Input:
//		Java Full Stack
//
//		Output:
//		Java-Full-Stack
	String str="Java Full Stack";
	
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)!=' ') {
			System.out.print(str.charAt(i));
		}else {
			System.out.print("-");
		}
	}
}
}
