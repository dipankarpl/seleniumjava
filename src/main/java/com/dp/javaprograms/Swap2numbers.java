package com.dp.javaprograms;

public class Swap2numbers {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		System.out.println("a = " + a + ", b = " + b);
		
		int sum = a;
		a = b;
		b = sum;
		
		System.out.println("a = " + a + ", b = " + b);
		
		a=a+b;//15
		b=a-b;//10
		a=a-b;//5
		
		System.out.println("a = " + a + ", b = " + b);

	}

}
