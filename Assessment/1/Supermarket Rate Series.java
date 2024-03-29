// Description:
// In a supermarket, the rate of items differs every day. In each day it first increases a lot then decreases a little bit. Based on this concept the manager framed a series. Now your task is to find the series for the given number of days. Write program to generate the first 'n' terms of the following series 2, 3, 8, 63, 3968...

// Input Format:
// The input is an integer 'n' which denotes the number of terms to be printed in the series.

// Output Format:
// Print the series and refer to the sample output for formatting.

// Sample Input 1:
// 5

// Sample Output 1:
// 2 3 8 63 3968

// Explanation:
// Here the input is 5 and hence 5 terms are printed.

// Sample Input 2:
// 1

// Sample Output 2:
// 2

// Explanation:
// Here the input is 1 and hence 1 term is printed.

// Logic:
// 1st number is 2, 2nd number is 1st square - 1, 3rd is 2nd square - 1, and so on

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int n = ar.nextInt();
        long a = 2;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a = a * a - 1;
        }
    }
}
