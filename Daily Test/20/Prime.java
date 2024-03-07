// Description:
// Write a Java program to check whether the given is number prime or not.

// Input Format:
// The input consist of Integer

// Output Format:
// The output consists of String
// Prime/Not prime

// Sample Input:
// 17

// Sample Output:
// Prime

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int num = ar.nextInt();
        String result = isPrime(num) ? "Prime" : "Not prime";
        System.out.println(result);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
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
