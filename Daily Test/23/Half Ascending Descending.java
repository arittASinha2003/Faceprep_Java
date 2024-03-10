// Description:
// Write a java program to sort the first half of an array in ascending order and the second half in descending order.

// Input Format:
// The first line contains an integer 'N', denoting the size of the array.
// The next line contains space-separated integers denoting the elements of the array.

// Output Format:
// Print sorted array

// Sample Input:
// 6
// 1 2 3 4 5 6

// Sample Output:
// 1 2 3 6 5 4

// Input:
// 9
// 5 2 4 7 9 3 1 6 8

// Output:
// 2 4 5 7 9 8 6 3 1

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int N = ar.nextInt();
        Integer[] array = new Integer[N];
        for(int i = 0; i < N; i++) {
            array[i] = ar.nextInt();
        }
        Arrays.sort(array, 0, N/2);
        Arrays.sort(array, N/2, N, Collections.reverseOrder());
        for(int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
