package com.dp.javaprograms;

public class OddEvenNumbers {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 4, 6, 3, 8};

        System.out.print("Even numbers: ");
        printEvenNumbers(array);

        System.out.print("Odd numbers: ");
        printOddNumbers(array);
    }

    static void printEvenNumbers(int[] array) {
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); // Move to the next line after printing even numbers
    }

    static void printOddNumbers(int[] array) {
        for (int num : array) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); // Move to the next line after printing odd numbers
    }
}
