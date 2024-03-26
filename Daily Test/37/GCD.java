// Description:
// Write a java program to find the GCD of two number in the given numbers.

// Input Format:
// The input consist of two Integers

// Output Format:
// The output consists of Integer

// Sample Input:
// 5
// 10

// Sample Output:
// 5

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int num1 = ar.nextInt();
        int num2 = ar.nextInt();
        System.out.println(gcd(num1, num2));
    }

    public static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }
}
