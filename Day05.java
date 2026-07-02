package com.tka;

public class Day05 {
	// Remove Duplicates from Sorted Array
	public void removeDuplicateArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicae = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isDuplicae = true;
					continue;
				}

			}
			if (!isDuplicae) {
				System.out.println(arr[i]);

			}

		}

	}

	public void chechPalindrome(String str) {
		int start = 0;
		int end = str.length() - 1;
		boolean isPalindrome = true;
		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				isPalindrome = false;

			}
			start++;
			end--;

		}
		if (isPalindrome) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}

	public static void main(String[] args) {
		Day05 d = new Day05();
		int arr[] = { 1, 1, 2, 3, 4, 4, 5 };
		//d.removeDuplicateArray(arr);
		d.chechPalindrome("A man, a plan, a canal: Panama");
	}

}
