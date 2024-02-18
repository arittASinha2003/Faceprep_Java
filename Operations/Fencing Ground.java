// Description:
// The college ground is rectangular in shape. Management decides to build a fence around the ground. In order to help the construction workers to build a straight fence, they planned to place a thick rope around the ground. They wanted to buy only the exact length of the rope that is needed. They also wanted to cover the entire ground with a thick carpet during the rainy season. They wanted to buy only the exact quantity of carpet that is needed. They requested your help. Can you please help them by writing a program to find the exact length of the rope and the exact quantity of carper that is required?

// Input Format:
// Input consists of 2 integers.
// The first integer corresponds to the length of the ground.
// The second integer corresponds to the breadth of the ground.

// Output Format:
// Output consists of 2 integers.
// The first integer corresponds to the exact length of the rope.
// The second integer corresponds to the exact quantity of carper.

// Sample Input:
// 50
// 20

// Sample Output:
// 140m
// 1000sqm

import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner ar = new Scanner(System.in);
    int len = ar.nextInt();
    int wid = ar.nextInt();
    int rope = 2 * (len + wid);
    int carpet = len * wid;
    System.out.println(rope + "m");
    System.out.println(carpet + "sqm");
  }
}
