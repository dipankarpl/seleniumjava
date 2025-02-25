package com.dp.javaprograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 2, 7, 8, 8, 3 };

		System.out.println("Duplicate elements in given array: ");
		// Using HashSet to store unique elements
		Set<Integer> uniqueElements = new HashSet<>();
		for (int num : arr) {
			if (!uniqueElements.add(num)) {
				System.out.println(num);
			}
		}
	}
}
