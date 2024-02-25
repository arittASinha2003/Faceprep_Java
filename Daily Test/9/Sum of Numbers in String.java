// Description:
// Write a Java program to find the sum of numbers in the given alpha numeric string.

// Input Format:
// The input consist of Integer and String

// Output Format:
// The output consists of Integer

// Sample Input:
// 20ea4t

// Sample Output:
// 24

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        String str = ar.nextLine();
        int sum = 0;
        String temp = "0";

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                temp += c;
            } else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }

        sum += Integer.parseInt(temp);
        System.out.println(sum);
    }
}
