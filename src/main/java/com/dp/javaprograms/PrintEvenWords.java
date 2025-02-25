package com.dp.javaprograms;

public class PrintEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "crazy frog jump";
		String words[] = str.split(" ");

		for (String word : words) {
			if (word.length() % 2 == 0) {
				System.out.println(word);
			}

		}

	}
}
