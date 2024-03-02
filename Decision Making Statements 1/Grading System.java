// Description:
// The newly appointed Vice-Chancellor of Anna University wanted to create an automated grading system for the students to check their grade. When a student enters a mark, the grading system displays the corresponding grade. Write a program to solve the given problem. The grades for marks 100 - S, 90-99 is A, 80-89 is B, 70-79 is C, 60-69 is D, 50-59 is E and less than 50 is F.

// Input Format:
// The input consists of one integer which corresponds to the marks scored by the student

// Output Format:
// If a student marks greater than 100, print "Invalid Input". Otherwise, print the grade.

// Sample Input:
// 78

// Sample Output:
// C

import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner ar = new Scanner(System.in);
      int marks = ar.nextInt();
      
      if (marks == 100)
        System.out.println("S");
      else if (marks >= 90 && marks <= 99)
        System.out.println("A");
      else if (marks >= 80 && marks <= 89)
        System.out.println("B");
      else if (marks >= 70 && marks <= 79)
        System.out.println("C");
      else if (marks >= 60 && marks <= 69)
        System.out.println("D");
      else if (marks >= 50 && marks <= 59)
        System.out.println("E");
      else if (marks < 50)
        System.out.println("F");
      else
        System.out.println("Invalid Input");
    }
}
