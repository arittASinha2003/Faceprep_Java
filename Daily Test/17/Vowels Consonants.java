// Description:
// There was a boy named Ziro having fun by asking the people of their's initial. If the people who has vowel character as their initial and says that to him, he just replies "WOW, Hello!", else he replies "Continue to soar higher!". If the initial is out of alphabet, then he replies "That's a weird initial! I like it!". Write a Java program to help him out to find vowels and consonants.

// Input Format:
// Input corresponds to the character.

// Output Format:
// Refer the following sample output

// Sample Input:
// E

// Sample Output:
// WOW, Hello!

// Input:
// i

// Output:
// WOW, Hello!

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        char initial = ar.next().charAt(0);

        if ((initial >= 'a' && initial <= 'z') || (initial >= 'A' && initial <= 'Z')) {
            switch (initial) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("WOW, Hello!");
                    break;
                default:
                    System.out.println("Continue to soar higher!");
            }
        } else {
            System.out.println("That's a weird initial! I like it!");
        }
    }
}
