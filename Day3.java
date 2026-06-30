package com.tka;

public class Day3 {
	public boolean checkingPalindrome(int num) {
		int rev = 0;
		int num2 = num;
		while (num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;

		}
		if (num2 == rev) {
			return true;

		} else {
			return false;
		}

	}

	public boolean checkingduplicate(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					return true;

				}

			}

		}
		return false;

	}

	public static void main(String[] args) {
		Day3 p = new Day3();
		boolean result = p.checkingPalindrome(-121);
		System.out.println(result);
		int arr[]= {1,2,3,4,5};
		System.out.println(p.checkingduplicate(arr));

	}

}
