// Description:
// Write a java program to get 2 numbers from the user and swap their values without any loss of data. You can make use of additional variable for swapping. Print the corresponding swapped values of the two numbers as output in the console.

// Input Format:
// First input: an integer
// Second input: an integer

// Output Format:
// The output will be integers(swapped values)

// Sample Input:
// 20
// 10

// Sample Output:
// 10
// 20

import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner ar = new Scanner(System.in);
      int a = ar.nextInt();
      int b = ar.nextInt();
      //System.out.println(b + "\n" + a);
      int temp = b;
      b = a;
      a = temp;
      System.out.println(a + "\n" + b);
    }
}
