// Description:
// Write a Java program to get 2 numbers from the user and calculate their sum and difference using '+' and '-' operators respectively. Print the corresponding sum and difference of the numbers as output in the console.

// Input Format:
// First input: an integer
// Second input: an integer

// Output Format:
// First output will be the sum of two integers
// Second output will be the difference of two integers

// Sample Input:
// 55
// 34

// Sample Output:
// 89
// 21

import java.util.Scanner;
class Main
{
    	public static void main(String args[])
        {
          Scanner ar = new Scanner(System.in);
          int a = ar.nextInt();
          int b = ar.nextInt();
          int sum = a + b;
          int diff = a - b;
          System.out.println(sum + "\n" + diff);
        }
}
