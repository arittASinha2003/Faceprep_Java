// Description:
// Write a Java Program to print addition of N numbers.
// Given N integer numbers (user will read numbers one by one) and find sum/addition of all given numbers.

// Input Format :
// Input consist of an Integer

// Output Format:
// Output consist of an Integer

// Sample Input:
// 5
// 100
// 200
// 300
// 400
// 500

// Sample Output:
// 1500

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int N = ar.nextInt();
        int sum = 0;
        for(int i = 0; i < N; i++) {
            int num = ar.nextInt();
            sum += num;
        }
        System.out.println(sum);
    }
}
