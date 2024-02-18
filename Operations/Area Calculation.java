// Description:
// Sheela has three things in her bag. She wants to compute the area of 3 things but 3 things are in different shapes. The three things are in a square shape, rectangular shape, and circular shape respectively.  Write a program to help Sheela to calculate the area of different shapes.

// Input Format:
// First input: a side of a square in integer
// Second input: length of a rectangle in integer
// Third input: breadth of a rectangle in integer
// Fourth input: radius of a circle in float

// Output Format:
// The first output should be the area of a square in integer
// The second output should be the area of a rectangle in integer
// The third output should be the area of a circle in float with 2 decimal places

// Sample Input:
// 5
// 5
// 4
// 2.0

// Sample Output:
// 25
// 20
// 12.56

import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner ar = new Scanner(System.in);
      int side = ar.nextInt();
      int len = ar.nextInt();
      int wid = ar.nextInt();
      float rad = ar.nextFloat();
      int sq_area = side * side;
      int rec_area = len * wid;
      float cir_area = 3.14f * rad * rad;
      System.out.printf("%d\n%d\n%.2f\n", sq_area, rec_area, cir_area);
    }
}
