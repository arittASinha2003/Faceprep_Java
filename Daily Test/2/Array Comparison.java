// Description:
// Write a Java Program that given two arrays, you need to compare them and display if they are the same or not.

// Input Format:
// Input consists of 2n+1 integers.
// The first integer corresponds to the size of the array.
// The next 'n' integers correspond to the elements in the first array.
// The next 'n' integers correspond to the elements in the second array.
// Assume that the maximum value of n is 15.

// Output Format:
// Print Yes if the 2 arrays are the same. Print No if the 2 arrays are different.

// Sample Input:
// 5
// 2
// 3
// 6
// 8
// -1
// 2
// 3
// 6
// 8
// -1

// Sample Output:
// Yes

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int n = ar.nextInt();
        int[] array1 = new int[n];
        int[] array2 = new int[n];

        for (int i = 0; i < n; i++) {
            array1[i] = ar.nextInt();
        }

        for (int i = 0; i < n; i++) {
            array2[i] = ar.nextInt();
        }

        if (Arrays.equals(array1, array2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
