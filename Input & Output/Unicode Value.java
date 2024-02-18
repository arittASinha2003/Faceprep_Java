// Description:
// Write a program to get a character as input and print its Unicode value. When a character is entered, the character itself is not stored. Instead, a numeric value(Unicode value) is stored.

// Sample Input:
// g

// Sample Output:
// 103

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        char ch = ar.next().charAt(0);
        int unicode = ch;
        System.out.println(unicode);
    }
}
