// Description:
// Write a Java program to check if batches of size 3 are summing up to the same value.

// Input Format:
// Input format consist of an Integer.

// Output Format:
// Output format consist of an Integer.

// Sample Input 1:
// 6
// 1 2 3 5 0 1

// Sample Output 1:
// Perfect Batch

// Sample Input 2:
// 6
// 1 1 2 2 3 3

// Sample Output 2:
// Not a Perfect Batch

// Sample Input 3:
// 9
// 1 5 2 3 2 3 1 0 7

// Sample Output 3:
// Perfect Batch

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int n = ar.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ar.nextInt();
        }
        int sum = arr[0] + arr[1] + arr[2];
        boolean isPerfectBatch = true;
        for (int i = 3; i < n; i += 3) {
            int currentSum = arr[i] + arr[i+1] + arr[i+2];
            if (currentSum != sum) {
                isPerfectBatch = false;
                break;
            }
        }
        if (isPerfectBatch) {
            System.out.println("Perfect Batch");
        } else {
            System.out.println("Not a Perfect Batch");
        }
    }
}
