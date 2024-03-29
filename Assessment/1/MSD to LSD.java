// Description:
// Write a program to print digits of a number from Most significant digit to least using recursion.
// Get a number from the user and print it's digits from MSD to LSD. Digits will be separated by a newline.

// Sample Input:
// 123

// Sample Output:
// 1
// 2
// 3

import java.util.Scanner;

public class Main {
    public static void printDigits(int num) {
        if(num > 0) {
            printDigits(num / 10);
            System.out.println(num % 10);
        }
    }

    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int num = ar.nextInt();
        printDigits(num);
    }
}
