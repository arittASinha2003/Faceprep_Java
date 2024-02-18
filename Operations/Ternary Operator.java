// Description:
// The conditional operator is also known as ternary operator [exp? true: false] can be used to make an either-or choice.  Write a program to get a number from the user and find out whether it is odd or even.

// Input Format:
// The input containing integer denotes the given number.

// Output Format:
// If given number is even, print "Even". Otherwise, print "Odd".

// Sample Input:
// 5

// Sample Output:
// Odd

import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner ar = new Scanner(System.in);
      int num = ar.nextInt();
      //if (num % 2 == 0)
        //System.out.println("Even");
      //else
        //System.out.println("Odd");
      String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
