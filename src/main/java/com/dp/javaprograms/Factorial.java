package com.dp.javaprograms;

import java.math.BigInteger;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 100;
		BigInteger fact=BigInteger.ONE;
		for (int i = 1; i <=number; i++) {
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fact);
	}

}
