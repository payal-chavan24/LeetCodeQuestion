package com.tka;

import java.util.Scanner;

public class TwoSameArray {
	public static void main(String[] args) {
//	Two Sum (Easy Level)
//
//	You are given an array of numbers and a target.
//
//	Find two numbers whose sum is equal to target and return their indexes.
//
//	Example:
//	nums = [2, 7, 11, 15]
//	target = 9
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array Elemets");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter target");
		int target = sc.nextInt();
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] + arr[i + 1] == target) {
				System.out.println("elemet are =" + arr[i] + " " + arr[i + 1]);
				System.out.println("index =" + i + " " + (i + 1));

			} else {
				System.out.println("No such element is peresent");
			}

		}
	}
}
