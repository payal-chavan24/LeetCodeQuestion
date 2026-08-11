package com;

public class PalindromeString {

//	Check if String is Palindrome
//	Input: "madam"
//	Output: true

	
	public boolean checkingPalindrome(String str) {
		int start=0;
		int end=str.length()-1;
		while(start<end) {
			if(str.charAt(start)!=str.charAt(end)) {
				return false;
			}
			start++;
			end--;
			
		}
		return true;
	}
	public static void main(String[] args) {
		PalindromeString p=new PalindromeString();
	   boolean result=p.checkingPalindrome("mabamg");
	   System.out.println(result);
	}
}
