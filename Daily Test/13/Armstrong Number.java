// Description:
// Write a Java program to print the given number is armstrong number or not.

// Input Format:
// Input consists of Integer

// Output Format:
// Refer the sample output

// Sample Input 1:
// 407

// Sample Output 1:
// 407 is an Armstrong number

// Sample Input 2:
// 372

// Sample Output 2:
// 372 is not an Armstrong number

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int num = ar.nextInt();
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum, remainder, result = 0;
        originalNum = num;

        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, 3);
            originalNum /= 10;
        }

        if (result == num)
            return true;
        else
            return false;
    }
}
