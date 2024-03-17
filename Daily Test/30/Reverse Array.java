// Description:
// Write a program to find the reverse an array in the given array using rescursion

// Input Format:
// The input consist of Integer

// Output Format:
// The output consists of Integer

// Sample Input:
// 3
// 3 2 1

// Sample Output:
// 1 2 3

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int n = ar.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = ar.nextInt();
        }
        reverseArray(array, 0, n - 1);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    static void reverseArray(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        reverseArray(array, start + 1, end - 1);
    }
}
