// Description:
// Write a java program to find the prime numbers in given range in the given input.

// Input Format:
// The input consist of two Integers

// Output Format:
// The output consists of Integers

// Sample Input:
// 4
// 10

// Sample Output:
// 5
// 7

// Input:
// 1
// 10

// Output:
// 3
// 5
// 7

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int start = ar.nextInt();
        int end = ar.nextInt();

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
