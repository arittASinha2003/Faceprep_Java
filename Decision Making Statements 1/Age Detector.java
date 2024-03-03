// Description:
// Age Detector
// Ask a user for their birth year encoded as two digits (like "62") and for the current year, also encoded as two digits (like "99"). Write a java program to find the users current age in years.

// Input Format:
// Input consists of 2 integers
// The first integer corresponds to the last 2 digits of the birth year
// The second integer corresponds to the last 2 digits of the current year

// Output Format:
// Print the user's current age
// Refer below sample output for formatting.

// Sample Input:
// 62
// 00

// Sample Output:
// 38

// Input (stdin):
// 62
// 99

// Output (stdout):
// 37

// Input (stdin):
// 30
// 23

// Output (stdout):
// 93

// Input (stdin):
// 50
// 20

// Output (stdout):
// 70

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        
        int birthYear = ar.nextInt();
        int currentYear = ar.nextInt();
        
        int age;
        
        if(currentYear >= birthYear) {
            age = currentYear - birthYear;
        } else {
            age = (100 - birthYear) + currentYear;
        }
        
        System.out.println(age);
    }
}
