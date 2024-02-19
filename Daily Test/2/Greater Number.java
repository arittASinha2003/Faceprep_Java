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

        int greatest = num1;
        if (num2 > greatest) {
            greatest = num2;
        }
        if (num3 > greatest) {
            greatest = num3;
        }

        System.out.println(greatest + " is greater");
    }
}
