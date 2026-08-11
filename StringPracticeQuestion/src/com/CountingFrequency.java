package com;

public class CountingFrequency {
	public static void main(String[] args) {
//	Input:
//		banana
//
//		Output:
//		b = 1
//		a = 3
//		n = 2
		String str = "banana";
		for (int i = 0; i < str.length(); i++) {
			boolean isDuplicate = false;
			for (int k = 0; k < i; k++) {
				if (str.charAt(i) == str.charAt(k)) {
					isDuplicate = true;
				}
			}
			if (isDuplicate) {
				continue;
			}
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			System.out.println(str.charAt(i) + " " + count);
		}

	}
}
