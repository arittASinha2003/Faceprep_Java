// Description:
// Write a Java program to Get a number and check whether it is a palindrome number or not.

// Input Format:
// Input consist of an Integer.

// Output Format:
// Output consist of a Strings.

// Sample Input:
// 2345

// Sample Output:
// Not a palindrome

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int num = ar.nextInt();
        int reversedNum = 0, remainder, originalNum;

        originalNum = num;

        // reverse the number
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        // check if the number is a palindrome
        if (originalNum == reversedNum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
