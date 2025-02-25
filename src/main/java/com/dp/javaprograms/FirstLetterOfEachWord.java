package com.dp.javaprograms;

public class FirstLetterOfEachWord {
    public static void main(String[] args) {
        String inputString = "This is a simple string example./fgsdjh";
        printFirstLetters(inputString);
    }

    static void printFirstLetters(String str) {
        // Split the string into words using spaces
        String[] words = str.split("[\\s`~!@#$%^&*()_+-=\\[\\]{}|;',./:\"<>?]+");
        
        System.out.print("First letters of each word: ");
        for (String word : words) {
            // Check if the word is not empty
            if (!word.isEmpty()) {
                System.out.print(word.charAt(0) + " "); // Print the first letter
            }
        }
        System.out.println(); // Move to the next line
    }
}