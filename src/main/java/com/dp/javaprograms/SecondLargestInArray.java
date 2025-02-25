package com.dp.javaprograms;

public class SecondLargestInArray {
	public static void main(String[] args) {

		int arr[] = { 3, 5, 4, 1, 2 };
		int secLargest = secondLargestNumber(arr);
		System.out.println(secLargest);
	}

	private static int secondLargestNumber(int[] arr) {
		// TODO Auto-generated method stub
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i : arr) {
			if (i > largest) {
				secondLargest = largest;
				largest = i;
			} else if (i > secondLargest && i != largest) {
				secondLargest = i;
			}
		}

		return secondLargest;
	}

}
