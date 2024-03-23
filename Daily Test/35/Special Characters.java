// Description:
// SecretMessage agency provides message encoding and decoding services for secure data transfer. The first step in decoding includes removal of special characters from the message, as special characters and whitespaces do not hold any meaning.
// Write an algorithm to help the agency find the number of special characters in a given message.

// Input Format:
// The input consists of a string message, representing the message that need to be decoded by the agency.

// Output Format:
// Print an integer representing the number of special characters present in a given message.

// Input:
// gasgg54@#vscsds*

// Output:
// 3

// Explanation:
// The special characters having no meaning are [‘@’,’#’,’*’].

// Input:
// !123

// Output:
// 1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        String message = ar.nextLine();
        int specialCharCount = 0;

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                specialCharCount++;
            }
        }

        System.out.println(specialCharCount);
    }
}
