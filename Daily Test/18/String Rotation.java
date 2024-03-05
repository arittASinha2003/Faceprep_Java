// Description:
// Write a Java program to find rotate a string based on given input.

// Note:
// First input is consist on String
// Second input is consist on Integer(based on rotation)

// Input Format:
// The input consist of Integer and String

// Output Format:
// The output consists of String

// Sample Input:
// Scanner
// 4

// Sample Output:
// nnerSca

// Input:
// String
// 3

// Output:
// ingStr

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        String inputString = ar.nextLine();
        int rotation = ar.nextInt();

        String rotatedString = rotateString(inputString, rotation);
        System.out.println(rotatedString);
    }

    private static String rotateString(String s, int rotation) {
        int len = s.length();
        rotation = rotation % len;
        return s.substring(len - rotation) + s.substring(0, len - rotation);
    }
}
