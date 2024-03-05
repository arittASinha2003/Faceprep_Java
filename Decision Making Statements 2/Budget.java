// Description:
// Budget
// It’s your job to calculate the cost of replacing damaged battle droids and to check whether it is within the budget limit of Rs. 15000. The cost of the equipment and parts is given below. Blast Rifle Rs. 350.34 Visual Sensors Rs. 230.90 Auditory Sensors Rs. 190.55 Arms Rs. 125.30 Legs Rs. 180.90 Write a program to solve this problem.

// Input Format:
// Input consists of 5 integers
// The first input denotes the number of blast rifles needed
// The second input denotes the number of visual sensors needed
// The third input denotes the number of auditory sensors needed
// The fourth input denotes the number of arms needed
// The fifth input denotes the number of legs needed

// Output Format:
// If the total cost of replacing damaged battle droids is within the sanctioned budget of Rs. 15000, print "Yes". Otherwise, print "No"
// Refer the sample output for formatting

// Sample Input:
// 20
// 10
// 14
// 3
// 9

// Sample Output:
// Yes

import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner ar = new Scanner(System.in);
      int br = ar.nextInt();
      int vs = ar.nextInt();
      int as = ar.nextInt();
      int arms = ar.nextInt();
      int legs = ar.nextInt();
      
      double br_total = br * 350.34;
      double vs_total = vs * 230.90;
      double as_total = as * 190.55;
      double arms_total = arms * 125.30;
      double legs_total = legs * 180.90;
      double total = br_total + vs_total + as_total + arms_total + legs_total;
      
      if (total <= 15000)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}
