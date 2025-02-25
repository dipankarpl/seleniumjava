package com.dp.javaprograms;

public class FrequencyOfCharWOMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		int freq[] = new int[256];

		for (int i = 0; i < str.length(); i++) {
			freq[str.charAt(i)]++;
		}

		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 0) {
				System.out.println((char) i + " " + freq[i]);
			}

		}

	}

}
