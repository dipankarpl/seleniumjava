package com.dp.javaprograms;

import java.util.HashMap;

public class FrequencyOfCharMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		char arr[] = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (char c : arr) {
			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}

		for (char ch : hm.keySet()) {
			System.out.println(ch + " : " + hm.get(ch));
		}

	}

}
