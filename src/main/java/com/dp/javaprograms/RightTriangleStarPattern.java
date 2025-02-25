package com.dp.javaprograms;

public class RightTriangleStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height = 5;

		for (int i = 0; i < height; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

/*

*
**
***
****
*****

*/