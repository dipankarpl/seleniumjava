package com.dp.javaprograms;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -5, 0, -3 };
		int left = 0;
		int right = arr.length-1;
		int temp;
		
		while(right>left) {
			temp=arr[right];
			arr[right]=arr[left];
			arr[left]=temp;
			right--;
			left++;
		}
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
