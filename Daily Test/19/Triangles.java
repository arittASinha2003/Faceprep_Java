// Description:
// Write a Java program to count the number of possible triangles that can be formed from the given unsorted array of positive integers.

// Input Format:
// The first line of input consists of the size of array
// The second line consists of all the elements of the array

// Output Format:
// Refer sample output for formatting specifications

// Sample Input:
// 5
// 4 22 7 5 10

// Sample Output:
// Total possible triangles:
// 3

// Input:
// 4
// 1 1 2 2

// Output:
// Total possible triangles:
// 2

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int n = ar.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ar.nextInt();
        }
        System.out.println("Total possible triangles:\n" + findNumberOfTriangles(arr, n));
    }

    static int findNumberOfTriangles(int arr[], int n) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < n - 2; ++i) {
            int k = i + 2;
            for (int j = i + 1; j < n; ++j) {
                while (k < n && arr[i] + arr[j] > arr[k]) {
                    ++k;
                }
                if (k > j) {
                    count += k - j - 1;
                }
            }
        }
        return count;
    }
}
