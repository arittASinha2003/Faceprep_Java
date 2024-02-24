// Description:
// Write a Java program to check whether the given integer is a happy number or unhappy number. [Note: A happy number is a number that leads to 1 after a sequence of steps where in each step, number is replaced by sum of squares of its digit].

// Input Format:
// Input consists of an integer value

// Output Format:
// Output consists of a string
// Refer sample output for formatting specifications

// Sample Input:
// 49

// Sample Output:
// Happy Number

// Sample Input:
// 0

// Sample Output:
// Unhappy Number

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int num = ar.nextInt();
        Set<Integer> seenNumbers = new HashSet<>();
        while (num != 1 && !seenNumbers.contains(num)) {
            seenNumbers.add(num);
            num = getSumOfSquaresOfDigits(num);
        }
        if (num == 1) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Unhappy Number");
        }
    }

    private static int getSumOfSquaresOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}
