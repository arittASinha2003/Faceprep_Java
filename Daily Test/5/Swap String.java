// Description:
// Write a Java Program to swap two string variables without using a third or temp variable.

// Input Format:
// Input consist of a Strings and Integer

// Output Format:
// Output consist of a Strings and Integer

// Sample Input:
// Good
// Morning

// Sample Output:
// Strings before swapping: Good Morning
// Strings after swapping: Morning Good

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner ar = new Scanner(System.in);
//         String str1 = ar.nextLine();
//         String str2 = ar.nextLine();

//         System.out.println("Strings before swapping: " + str1 + " " + str2);

//         // Concatenate both strings
//         str1 = str1 + str2;
//         // Extract the second string from the concatenated string
//         str2 = str1.substring(0, (str1.length() - str2.length()));
//         // Extract the first string from the concatenated string
//         str1 = str1.substring(str2.length());

//         System.out.println("Strings after swapping: " + str1 + " " + str2);
//     }
// }

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner ar = new Scanner(System.in);
        String str1 = ar.next();
        String str2 = ar.next();
        System.out.println("Strings before swapping: " + str1 + " " + str2);
        
        str1 = str1 + str2;
        str2 = str1.substring(0, (str1.length() - str2.length()));
        str1 = str1.substring(str2.length());
        System.out.println("Strings after swapping: " + str1 + " " + str2);
    }
}
