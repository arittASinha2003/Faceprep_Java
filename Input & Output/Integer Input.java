// Description:
// Java programming has several in-built functions to perform input and output tasks. Two commonly used functions for I/O (Input/Output) are System.out.println() and System.in(). Write a program to get an integer as input and print it. The System.in() function reads formatted input from the keyboard. When the user enters an integer, it is stored in variable testInteger. Format string %d is used in case of integer types. Note the '&' sign before testInteger; &testInteger gets the address of testInteger and the value is stored in that address.

// Sample Input:
// 56

// Sample Output:
// 56

import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner ar = new Scanner(System.in);
      int num = ar.nextInt();
      //System.out.println(num);
      System.out.printf("%d\n", num);
    }
}
