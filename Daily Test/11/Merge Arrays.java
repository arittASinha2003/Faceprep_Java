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

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);

        int size1 = ar.nextInt();
        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            array1[i] = ar.nextInt();
        }

        int size2 = ar.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            array2[i] = ar.nextInt();
        }

        int[] mergedArray = mergeArrays(array1, array2);

        for (int i : mergedArray) {
            System.out.print(i + " ");
        }
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        Set<Integer> set = new TreeSet<>();

        for (int i : array1) {
            set.add(i);
        }

        for (int i : array2) {
            set.add(i);
        }

        int[] result = new int[set.size()];
        int i = 0;
        for (Integer num : set) {
            result[i++] = num;
        }

        return result;
    }
}
