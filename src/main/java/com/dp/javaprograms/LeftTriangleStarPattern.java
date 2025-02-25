package com.dp.javaprograms;

public class LeftTriangleStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height = 5;

		for (int i = height; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= height - i; j++) {
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