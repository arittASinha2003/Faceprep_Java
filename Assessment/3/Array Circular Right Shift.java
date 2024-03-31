// Description:
// Given an array A[] and shift count (say S), circularly right shift the array A[] by S times.

// Sample Input 1:
// 6
// 9 2 0 -1 4 77
// 2

// Sample Output 1:
// 4 77 9 2 0 -1

// Sample Input 2:
// 4 1 2 3 4 4

// Sample Output 2:
// 1 2 3 4

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int n = ar.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = ar.nextInt();
        }
        int S = ar.nextInt();

        int[] shiftedArray = new int[n];
        for (int i = 0; i < n; i++) {
            shiftedArray[(i + S) % n] = A[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(shiftedArray[i] + " ");
        }
    }
}
