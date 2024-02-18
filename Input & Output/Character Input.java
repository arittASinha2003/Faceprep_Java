// Description:
// Two commonly used functions for I/O (Input/Output) are System.out.println() and System.in(). Write a program to get a character as input and print it. The Scanner class reads formatted input from the keyboard. When the user enters a character, it is stored in the variable test character.

// Sample Input:
// z

// Sample Output:
// z

import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner ar = new Scanner(System.in);
      char c = ar.next().charAt(0);
      System.out.println(c);
    }
}
