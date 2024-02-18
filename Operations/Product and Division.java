// Description:
// Write a program to get 2 numbers from the user and calculate their product, quotient, and remainder using '*', '/' and '%' operators respectively. Print the corresponding product, quotient and remainder of the numbers as output in the console.

// Input Format:
// First input: an integer
// Second input: an integer

// Output Format:
// The first output will be the product of two integers
// The second output will be the quotient
// The third output will be the remainder

// Sample Input:
// 50
// 10

// Sample Output:
// 500
// 5
// 0

import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner ar = new Scanner(System.in);
      int a = ar.nextInt();
      int b = ar.nextInt();
      int pro = a * b;
      int div = a / b;
      int rem = a % b;
      System.out.println(pro + "\n" + div + "\n" + rem);
    }
}
