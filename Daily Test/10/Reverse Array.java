// Description:
// Write a Java program to find the reverse an array in the given array.

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
        
        // Reading the array elements
        for (int i = 0; i < n; i++) {
            array[i] = ar.nextInt();
        }
        
        // Reversing the array
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
        
        // Printing the reversed array
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
