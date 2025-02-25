package com.dp.javaprograms;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int number = 7;
		int sum = 0;
		int sumofAllNumbers = (number * (number + 1) / 2);
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sumofAllNumbers - sum);
	}

}
