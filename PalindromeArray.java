package com.tka;

import java.util.Scanner;

public class PalindromeArray {
	public static void main(String[] args) {
		// find longest palindrome
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		sc.nextLine();
		String arr[] = new String[n];
		System.out.println("Enter string");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}
		String longest = "";

		for (String s : arr) {

			int start = 0;
			boolean isPalindrome = true;
			int end = s.length() - 1;
			while (start < end) {
				if (s.charAt(start) != s.charAt(end)) {
					isPalindrome = false;
                      break;
				}
				start++;
				end--;
			}
			if (isPalindrome && s.length() > longest.length()) {
				longest = s;

			}

		}
		System.out.println(longest);

	}
}
