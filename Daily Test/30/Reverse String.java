// Description:
// Write a Java program to print a string in reverse order.

// Input Format:
// Input consists of String

// Output Format:
// Output consist of String

// Sample Input:
// program fun

// Sample Output:
// nuf margorp

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        String input = ar.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println(reversed);
    }
}
