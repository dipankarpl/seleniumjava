package com.dp.javaprograms;

public class SecondSmallest {
	public static void main(String[] args) {
		int[] array = { 5, 2, 9, 1, 5, 6 };
		int secondSmallest = findSecondSmallest(array);

		if (secondSmallest != Integer.MAX_VALUE) {
			System.out.println("The second smallest number is: " + secondSmallest);
		} else {
			System.out.println("The array does not have a second smallest number.");
		}
	}

	static int findSecondSmallest(int[] array) {
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int num : array) {
			if (num < smallest) {
				secondSmallest = smallest; // Update second smallest
				smallest = num; // Update smallest
			} else if (num > smallest && num < secondSmallest) {
				secondSmallest = num; // Update second smallest
			}
		}

		return secondSmallest;
	}
}
