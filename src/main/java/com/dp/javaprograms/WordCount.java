package com.dp.javaprograms;

public class WordCount {
    public static void main(String[] args) {
        String inputString = "This is a simple string with several words.";
        int wordCount = countWords(inputString);
        
        System.out.println("The number of words in the string is: " + wordCount);
    }

    static int countWords(String str) {
        // Trim the string to remove leading and trailing spaces
        str = str.trim();
        
        // If the string is empty after trimming, return 0
        if (str.isEmpty()) {
            return 0;
        }

        // Split the string by one or more spaces using regex and count the length of the resulting array
        String[] words = str.split("\\s+");
        return words.length;
    }
}
