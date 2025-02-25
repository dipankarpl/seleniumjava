package com.dp.javaprograms;

public class SortedArray {
	public static void main(String[] args) {
		int[] array = { 5, 2, 9, 1, 5, 6 };
		bubbleSort(array);

		// Print sorted array
		for (int num : array) {
			System.out.print(num + " ");
		}
	}

	static void bubbleSort(int[] array) {
		int n = array.length;
		boolean swapped;

		for (int i = 0; i < n - 1; i++) {
			swapped = false;

			for (int j = 0; j < n - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					// Swap array[j] and array[j + 1]
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swapped = true;
				}
			}

			// If no two elements were swapped, the array is sorted
			if (!swapped)
				break;
		}
	}
}
