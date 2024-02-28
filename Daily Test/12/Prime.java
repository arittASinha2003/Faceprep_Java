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

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int start = ar.nextInt();
        int end = ar.nextInt();
        List<Integer> primes = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        // Print the prime numbers
        for (Integer prime : primes) {
            System.out.println(prime);
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1 || num == 2) {
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
