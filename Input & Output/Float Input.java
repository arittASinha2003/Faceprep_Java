// Description:
// Write a program to get float as input and print it. The Scanner class reads formatted input from the keyboard. When the user enters the float value, it is stored in variable testFloat. Use '%.2f' in the System.out.printf() to display float value with 2 precisions.

// Sample Input 1:
// 56.2425

// Sample Output 1:
// 56.24

// Sample Input 2:
// 92.00

// Sample Output 2:
// 92.00

import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner ar = new Scanner(System.in);
      float num = ar.nextFloat();
      //System.out.println(num);
      System.out.printf("%.2f\n", num);
    }
}
