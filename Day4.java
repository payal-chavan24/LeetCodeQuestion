package com.tka;

public class Day4 {

	public void movingTowardLeftZero(int arr[]) {
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			if (arr[left] != 0) {
				left++;

			} else if (arr[right] == 0) {
				right--;

			} else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}

		}
		for (int i : arr) {
			System.out.println(i);
		}

	}

	public void merageSortedarray(int arr1[], int arr2[]) {
		int arr3[] = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			arr3[arr1.length + i] = arr2[i];
		}
		for (int i = 0; i < arr3.length; i++) {
			for (int j = i + 1; j < arr3.length; j++) {
				if (arr3[i] > arr3[j]) {
					int temp = arr3[j];
					arr3[j] = arr3[i];
					arr3[i] = temp;
				}

			}
		}
		for (int i : arr3) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Day4 d = new Day4();
		int arr[] = { 1, 0, 2, 0, 3, 0 };
		// d.movingTowardLeftZero(arr);
		int arr2[] = { 1, 23, 1 };
		d.merageSortedarray(arr, arr2);

	}

}
