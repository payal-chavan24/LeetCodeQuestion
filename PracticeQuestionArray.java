package com.tka;

public class PracticeQuestionArray {
//	Input: [1,2,3,1]
//			Output: true
//			Input: [1,2,3,4]
//			Output: false
	public boolean checkingDuplicate(int arr1[]) {

		for (int i = 0; i < arr1.length;i++) {
			int count = 0;
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] == arr1[j]) {

					count++;
				}
			}
			if (count == 0) {
				return false;
			}
		}
		return true;

	}
	//Input: [4,5,1,2,1,2,4]
	//Output: 5
	public void firstOccureElement( int arr1[]) {
		for(int i=0;i<arr1.length;i++) {
			int count=0;
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					count++;
				}
				
			}
			if(count==0) {
				System.out.println(arr1[i]);
				break;
			}
			
		}
		
	}
	public static void main(String[] args) {
		PracticeQuestionArray pr=new PracticeQuestionArray();
		int arr1[]= {4,5,1,2,1,2,4};
		//System.out.println(pr.checkingDuplicate(arr1));
		pr.firstOccureElement(arr1);
	}
	
}
