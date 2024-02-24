// Description:
// Write a Java Program to Print a Diamond Shape Pattern.

// Input Format:
// Input consist of an Integer.

// Output Format:
// Output consist of the following.

// Sample Input:
// 5

// Sample Output:
// *
// ***
// *****
// *******
// *********
// *******
// *****
// ***
// *

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int N = ar.nextInt();

        // Print the upper half of the diamond
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print the lower half of the diamond
        for (int i = N - 1; i > 0; i--) {
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
