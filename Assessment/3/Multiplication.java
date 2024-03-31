// Description:
// Given two numbers represented as strings, print multiplication of the numbers as a string.

// Note 1: The numbers can be arbitrarily large and are non-negative.
// Note 2: Your answer should not have leading zeroes. For example, 00 is not a valid answer.

// Input Format:
// Two strings

// Output Format:
// A single string

// Sample Input 1:
// 456
// 23

// Sample Output 1:
// 10488

// Sample Input 2:
// 12 10

// Sample Output 2:
// 120

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        String num1 = ar.nextLine();
        String num2 = ar.nextLine();

        BigInteger number1 = new BigInteger(num1);
        BigInteger number2 = new BigInteger(num2);

        BigInteger product = number1.multiply(number2);

        System.out.println(product.toString());
    }
}
