// Description:
// Write a java program to swap two values without using the 3rd variable.

// Input Format:
// First input: an integer
// Second input: an integer

// Output Format:
// The output will be integers(swapped values)

// Sample Input:
// 10
// 20

// Sample Output:
// 20
// 10

import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner ar = new Scanner(System.in);
      int a = ar.nextInt();
      int b = ar.nextInt();
      //System.out.println(b + "\n" + a);
      a = a + b;
      b = a - b;
      a = a - b;
      System.out.println(a + "\n" + b);
    }
}
