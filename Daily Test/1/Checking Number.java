// Description:
// Write a Java program to find whether the given number is positive or negative.

// Input Format:
// Input consists of 1 integer.

// Sample Input & Output 1:
// 56
// Positive

// Sample Input & Output 2:
// -56
// Negative

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int num = ar.nextInt();

        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
