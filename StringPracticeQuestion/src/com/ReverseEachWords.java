package com;

public class ReverseEachWords {
public static void main(String[] args) {
//	Input:
//		Java Full Stack
//
//		Output:
//		avaJ lluF kcatS
	String str="Java Full Stack";
	String store="";
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)!=' ') {
			store=store+str.charAt(i);
		}else {
			for(int j=store.length()-1;j>=0;j--) {
				System.out.print(store.charAt(j));
			}
			System.out.print(" ");
			store="";
		}
	}
	for(int i=store.length()-1;i>=0;i--) {
		System.out.print(store.charAt(i));
	}
}
}
