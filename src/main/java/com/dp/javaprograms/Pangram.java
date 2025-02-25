package com.dp.javaprograms;

public class Pangram {

	public static void pangram(String st) {
		boolean png = true;

		for (char i = 'a'; i <= 'z'; i++) {
			if (st.indexOf(i) < 0) {
				png = false;
				break;
			}
		}

		if (png) {
			System.out.println("pangram");
		} else {
			System.out.println("not pangram");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "quick brown fox jumps over the lazy dog";
		String input = str.toLowerCase();
		if (input.length() < 26) {
			System.out.println("not pangram");
		} else {
			pangram(str);
		}
	}
}
