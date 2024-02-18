// Description:
// Write a java program to check whether the given character is vowel or consonant.

// Input Format: The input consist of a character

// Output Format: The output consists of a below-given string "Vowel" / "Consonant" / "Not an alphabet"

// Sample Input:
// a

// Sample Output:
// Vowel

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        char character = ar.next().charAt(0);

        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            switch (Character.toLowerCase(character)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
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
