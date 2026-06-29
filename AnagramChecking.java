package com.tka;

import java.util.Arrays;
import java.util.Collections;

public class AnagramChecking {
public static void main(String[] args) {
	String s="listen";
	String v="slent";
	if(s.length()!=v.length()) {
		System.out.println("not anagram"); 
	return;
	}
	char arr1[]=s.toCharArray();
	char arr2[]=v.toCharArray();
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	for(int i=0;i<arr1.length;i++) {
		if(arr1[i]!=arr2[i]) {
			System.out.println("Not anagram");
			return;
			
		}
		
	}
	System.out.println("Anagram");
	
		
	
}
}
