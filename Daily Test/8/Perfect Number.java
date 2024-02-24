// Description:
// Write a java program to find the perfect numbers and its count between a given range.

// Input Format:
// The first input contains an integer which denotes the starting number of the range
// The second input contains an integer which denotes the ending number of the range

// Output Format:
// Print the perfect numbers and its count in a given range

// Sample Input:
// 1
// 10

// Sample Output:
// 6
// count : 1

// Sample Input:
// 1
// 100

// Sample Output:
// 6
// 28
// count : 2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int start = ar.nextInt();
        int end = ar.nextInt();
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("count : " + count);
    }

    private static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
