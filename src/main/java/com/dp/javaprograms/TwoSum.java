package com.dp.javaprograms;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 3, 4 };
		int sum = 4;
		int result[]=calculateSwoSum(arr, sum);
		System.out.println(result[0]+" "+result[1]);
	}

	private static int[] calculateSwoSum(int[] arr, int sum) {

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			int comp = sum - arr[i];

			if (hm.containsKey(comp)) {
				int a[] = { hm.get(comp), i };
				return a;
			}
			hm.put(arr[i], i);
		}
		return null;

	}
}
