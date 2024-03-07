// Description:
// Checking Alphabets
// Write a java program to check whether the given character is vowel or consonant. 

// Input Format:
// The input consist of a character

// Output Format:
// The output consists of a below-given string "Vowel" / "Consonant" / "Not an alphabet"

// Sample Input:
// a

// Sample Output:
// Vowel

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        char ch = ar.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println("Vowel");
                    break;
                default:
                    System.out.println("Consonant");
            }
        } else {
            System.out.println("Not an alphabet");
        }
    }
}
