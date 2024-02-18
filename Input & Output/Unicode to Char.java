// Description:
// Write a program to get a number(Unicode values) as input and print its equivalent character. You can display a character if you know ASCII code of that character.

// Sample Input:
// 103

// Sample Output:
// g

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int unicode = ar.nextInt();
        char ch = (char) unicode;
        System.out.println(ch);
    }
}
