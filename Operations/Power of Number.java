// Description:
// pow() function is used to calculate the power of any base and it is defined in java.lang.Math package. Write a program to read X as the base and N as the power and calculate the result (X^N - X to the power of N).

// Input Format:
// The first line containing integer denotes the base(X)
// The second line containing integer denotes the power(N)

// Output Format:
// Print the power of a number

// Sample Input:
// 2
// 3

// Sample Output:
// 8

import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner ar = new Scanner(System.in);
      int base = ar.nextInt();
      int power = ar.nextInt();
      int ans = (int)(Math.pow(base, power));
      System.out.println(ans);
    }
}
