// Description:
// Get two integers x and y from the user and write a program to relate 2 integers as equal to, less than or greater than.

// Input Format:
// Input consist of 2 integers
// The first input corresponds to the first number(x)
// The second input corresponds to the second number(y)

// Output Format:
// If the first number is equal to the second number, print "x and y are equal". Otherwise, print "x greater than y" or "x less than y"

// Sample Input:
// 6
// 8

// Sample Output:
// 6 less than 8

import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner ar = new Scanner(System.in);
      int num1 = ar.nextInt();
      int num2 = ar.nextInt();
      
      if (num1 == num2)
        System.out.println(num1 + " and " + num2 + " are equal");
      else if (num1 > num2)
        System.out.println(num1 + " greater than " + num2);
      else
        System.out.println(num1 + " less than " + num2);
    }
}
