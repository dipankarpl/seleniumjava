package com.dp.javaprograms;

public class MoveAllZeroesEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 0, 3 };
		int move = 0;
		int temp;

		for (int i = 0; i < arr.length; i++) {//0	1	2
			if (arr[i] != 0) {//5	0	3
				temp = arr[move];//5	0
				arr[move] = arr[i];//5	3
				arr[i] = temp;//5	0
				move++;//1	2
			}

		}

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
