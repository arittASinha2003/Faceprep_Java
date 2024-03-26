// Description:
// Write a Java program to merge given two sorted arrays such that the elements are not repeated.

// Input Format:
// Input consist of an Integer.

// Output Format:
// Output consist of an Integer.

// Sample Input:
// Size: 8
// Array 1: 2, 4, 5, 6, 7, 9, 10, 13
// Size: 10
// Array 2: 2, 3, 4, 5, 6, 7, 8, 9, 11, 15

// Sample Output:
// 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15

// Input:
// 5
// 3 5 6 8 10
// 3
// 1 2 3

// Output:
// 1 2 3 5 6 8 10

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int n1 = ar.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = ar.nextInt();
        }
        int n2 = ar.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = ar.nextInt();
        }
        ar.close();

        int[] merged = mergeArrays(arr1, arr2);
        for (int i : merged) {
            System.out.print(i + " ");
        }
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        Set<Integer> set = new TreeSet<>();
        for (int i : arr1) {
            set.add(i);
        }
        for (int i : arr2) {
            set.add(i);
        }
        int[] merged = new int[set.size()];
        int index = 0;
        for (int i : set) {
            merged[index++] = i;
        }
        return merged;
    }
}
