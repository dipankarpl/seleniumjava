package com.dp.javaprograms;

public class SmalestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, -2, 0};
		int smallest=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println(smallest);
	}

}
