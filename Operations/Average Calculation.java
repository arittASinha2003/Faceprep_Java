// Description:
// A teacher wants to compute the average of 5 students in her class. Write a program to help her to find the average. The average is the sum of all the numbers, then divided by the total numbers.

// Input Format:
// First input: 1st student mark in float
// Second input: 2nd student mark in float
// Third input: 3rd student mark in float
// Fourth input: 4th student mark in float
// Fifth input: 5th student mark in float

// Output Format:
// The output value should be in float with 2 decimal places.

// Sample Input:
// 10 
// 20
// 30
// 40
// 50

// Sample Output:
// 30.00

import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner ar = new Scanner(System.in);
      float s1 = ar.nextFloat();
      float s2 = ar.nextFloat();
      float s3 = ar.nextFloat();
      float s4 = ar.nextFloat();
      float s5 = ar.nextFloat();
      float avg = (s1 + s2 + s3 + s4 + s5)/5;
      //System.out.println(avg);
      System.out.printf("%.2f", avg);
    }
}
