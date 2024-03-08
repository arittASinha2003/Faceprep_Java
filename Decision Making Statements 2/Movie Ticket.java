// Description:
// Matinee Movie Tickets
// Ask the customer's age and for the time on a 24-hour clock (where noon is 12.00 and 4:30 PM is 16.30). The show timings are 10.15, 13.30, 18.00 and 22.00. The normal adult ticket price is $8.00, however, the adult matinee price is $5.00. Adults are those over 13 years. The normal children's ticket price is $4.00, however, the children's matinee price is $2.00. Write a program that determines the price of a movie ticket

// Input Format:
// The first input containing an integer which denotes the age
// The second input containing the floating point number which denotes the show timing.

// Output Format:
// Print the price of a movie ticket.

// Sample Input:
// 16
// 10.15

// Sample Output:
// $8.00

// Input (stdin):
// 19
// 13.30

// Output (stdout):
// $5.00

// Input (stdin):
// 6
// 3.0

// Output (stdout):
// $4.00

// Input (stdin):
// 60
// 3.8

// Output (stdout):
// $8.00

import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner ar=new Scanner(System.in);
	  int a=ar.nextInt();
	  float b=ar.nextFloat();
	  float t=13.30f;
	  if(b==t)
	  {
	      if(a>13)
	        System.out.println("$5.00");
	       else
	        System.out.println("$2.00");
	  }
	  else
	  {
	      if(a>13)
	        System.out.println("$8.00");
	      else
	        System.out.println("$4.00");
	  }
	}
}
