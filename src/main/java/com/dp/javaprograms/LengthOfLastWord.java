package com.dp.javaprograms;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "crazyfrog ";
		String words[] = str.split(" ");

		String lastWOrd = words[words.length - 1];
		System.out.println(lastWOrd.length());
	}
}
