package com.dp.javaprograms;

import java.util.HashMap;
import java.util.Map.Entry;

public class FrequencyOfSpecialCharMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam abc!@#$!";
		char arr[] = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (char c : arr) {
			if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || (c == ' '))) {
//				if (hm.containsKey(c)) {
//					hm.put(c, hm.get(c) + 1);
//				} else
//					hm.put(c, 1);
				hm.put(c, hm.getOrDefault(c, 0)+1);
			}
		}

//		for (char ch : hm.keySet()) {
//			System.out.println(ch + " : " + hm.get(ch));
//		}
		for (Entry<Character, Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			
		}
	}

}
