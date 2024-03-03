// Description:
// Get an array of elements with size n from the user input. Write a java program to find all possible difference between two elements in the array. Then print the Larger difference and the two elements whose difference is larger than other elements.

// Input Format:
// The first line consists of size of array
// The next line consists of the elements of array 

// Output Format:
// Refer sample output for formatting specifications

// Sample Input:
// 5

// 9
// 8
// 5
// 3
// 6

// Sample Output:
// 6
// Elements with large difference
// 9
// 3

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int n = ar.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = ar.nextInt();
        }
        int max = array[0];
        int min = array[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println(max - min);
        System.out.println("Elements with large difference");
        if (minIndex < maxIndex) {
            System.out.println(min);
            System.out.println(max);
        } else {
            System.out.println(max);
            System.out.println(min);
        }
    }
}
