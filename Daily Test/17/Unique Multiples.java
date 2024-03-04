// Description:
// Write a Java program for the following case.
// Given a number, find the sum of all the unique multiples of particular numbers up to but not including that number.
// If we list all the natural numbers below 20 that are multiples of 3 or 5, we get 3, 5, 6, 9, 10, 12, 15, and 18.
// The sum of these multiples is 78.

// Input Format:
// All inputs corresponds to the Integer value

// Output Format:
// Output correspond to the multiplied value accordingly (Integer)

// Sample Input 1:
// 20
// 3
// 5

// Sample Output 1:
// 3 5 6 9 10 12 15 18
// 78

// Input:
// 20
// 0
// 2

// Output:
// Invalid Data

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int num = ar.nextInt();
        int firstMultiple = ar.nextInt();
        int secondMultiple = ar.nextInt();

        if (firstMultiple == 0 || secondMultiple == 0) {
            System.out.println("Invalid Data");
            return;
        }

        Set<Integer> multiples = new TreeSet<>();
        for (int i = firstMultiple; i < num; i += firstMultiple) {
            multiples.add(i);
        }
        for (int i = secondMultiple; i < num; i += secondMultiple) {
            multiples.add(i);
        }

        int sum = 0;
        for (int multiple : multiples) {
            System.out.print(multiple + " ");
            sum += multiple;
        }
        System.out.println("\n" + sum);
    }
}
