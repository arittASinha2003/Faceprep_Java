// Description:
// Write a Java program to sort the first half of the given array.

// Input Format:
// Integer => Size of an Array
// Integers => Array Elements

// Output Format:
// Integer => Sorted Array

// Sample Input:
// 6
// 6 7 2 3 2 1

// Sample Output:
// 2 6 7 3 2 1

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int size = ar.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = ar.nextInt();
        }
        Arrays.sort(array, 0, size / 2);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
