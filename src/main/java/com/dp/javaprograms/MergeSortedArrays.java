package com.dp.javaprograms;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3,7};
        int[] arr2 = {2, 3, 5,6,7, 8};

        int[] mergedArray = merge(arr1, arr2);
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Traverse both arrays and merge them
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merged[k]=arr1[i];
                k++;
                i++;
            } else {
            	merged[k]=arr2[j];
            	k++;
            	j++;
            }
        }

        // Copy remaining elements from arr1, if any
        while (i < n1) {
        	merged[k]=arr1[i];
            k++;
            i++;
        }

        // Copy remaining elements from arr2, if any
        while (j < n2) {
        	merged[k]=arr2[j];
        	k++;
        	j++;
        }

        return merged;
    }
}
