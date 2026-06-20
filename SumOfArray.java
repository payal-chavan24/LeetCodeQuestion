package com.tka;

import java.util.HashMap;
import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
//	Input: nums = [2,7,11,15], target = 9  
//			Output: [0,1]
		// by using nested loop time complexity will be 0(n2)
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int arr1[] = new int[size];
		System.out.println("Enter target value");
		int target = sc.nextInt();
		System.out.println("Enter array elements");
		for (int i = 0; i < size; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] + arr1[j] == target) {
					System.out.println(i + " " + j);

				}

			}

		}
		// by using single loop which have time complexity 0(n)
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {
			int temp = target - arr1[i];
			if (map.containsKey(temp)) {
				System.out.println(map.get(temp) + " " + i);
				return;
			} else {
				map.put(arr1[i], i);
			}
		}

	}
}
