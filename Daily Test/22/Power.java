// Description:
// Write a Java program to find the power of a given number using recursion

// Input Format:
// Input consists of Integers.

// Output Format:
// Output consists of Integer.

// Sample Input:
// 3
// 4

// Sample Output:
// 81

// Input:
// 6
// 8

// Output:
// 1679616

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int base = ar.nextInt();
        int exponent = ar.nextInt();
        System.out.println(power(base, exponent));
        ar.close();
    }

    public static int power(int base, int exponent) {
        if (exponent != 0) {
            return (base * power(base, exponent - 1));
        } else {
            return 1;
        }
    }
}
