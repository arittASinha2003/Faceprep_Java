// Description:
// Write a Java program to find the Arranging Strings in an Alphabetical Order.

// Input Format:
// The input consist of Integer and String

// Output Format:
// The output consists of String

// Note: Enter size of array and then enter all the names in that array. Now with the help of compareTo operator we can easily arranging names in Alphabetical Order.

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

// Input:
// 3
// priya
// eat
// apple

// Output:
// apple
// eat
// priya

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int n = ar.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = ar.next();
        }
        Arrays.sort(array);
        for (String str : array) {
            System.out.println(str);
        }
    }
}
