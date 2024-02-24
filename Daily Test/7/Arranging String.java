// Description:
// Write a Java program to find the Arranging Strings in an Alphabetical Order.

// Input Format:
// The input consist of Integer and String

// Output Format:
// The output consists of String

// Note: Enter size of array and then enter all the names in that array. Now with the help of compareTo operator we can easily arrange names in Alphabetical Order.

// Sample Input:
// 4
// Run
// Ate
// Bat
// Sun

// Sample Output:
// Ate
// Bat
// Run
// Sun

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int n = ar.nextInt();
        String[] arr = new String[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = ar.next();
        }
        // sort the array in alphabetical order
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
