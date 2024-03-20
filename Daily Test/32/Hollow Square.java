// Description:
// Write a program to print the Hollow square pattern.

// Input Format:
// Input consist of 1 integer.

// Output Format:
// Refer sample output.

// Sample Input:
// 3

// Sample Output:

// * * *
// *   *
// * * *

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int n = ar.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
