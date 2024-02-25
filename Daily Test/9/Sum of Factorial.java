// Description:
// Write a Java program to find the sum of factorial in given number.

// Input Format:
// The input consist of Integer

// Output Format:
// The output consists of Integer

// Sample Input:
// 5

// Sample Output:
// 153

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int num = ar.nextInt();
        long sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += factorial(i);
        }

        System.out.println(sum);
    }

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
