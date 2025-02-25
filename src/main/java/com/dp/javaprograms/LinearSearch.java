package com.dp.javaprograms;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -5, 0, -3 };
		int key = 0;
		int position = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				position = i;
				break;
			}
		}
		if (position > -1)
			System.out.println("key found at index " + (position+1));
		else
			System.out.println("key not found");
	}

}
