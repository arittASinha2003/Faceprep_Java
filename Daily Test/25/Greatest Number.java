// Description:
// Write a Java program to find the greatest among the three given numbers.

// Input Format:
// Input consists of 3 integers

// Sample Input & Output:
// 7
// 9
// 5

// 9 is greater.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int num1 = ar.nextInt();
        int num2 = ar.nextInt();
        int num3 = ar.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1 + " is greater");
            } else {
                System.out.println(num3 + " is greater");
            }
        } else {
            if (num2 > num3) {
                System.out.println(num2 + " is greater");
            } else {
                System.out.println(num3 + " is greater");
            }
        }
    }
}
