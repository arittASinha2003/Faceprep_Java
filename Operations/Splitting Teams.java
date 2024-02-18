// Description:
// During the Physical Education hour, PT sir has decided to conduct some team games. He wants to split the students in the class into equal-sized teams. In some cases, there may be some students who are left out from teams and he wanted to use the left out, students, to assist him in conducting the team games. For instance, if there are 50 students in the class and if the class has to be divided into 7 equal-sized teams, 7 students will be there in each team and 1 student will be left out. PT sir asks your help to automate this team splitting task. Can you please help him out?

// Input Format:
// Input consists of 2 integers.
// The first integer corresponds to the number of students in the class.
// The second integer corresponds to the number of teams.

// Output Format:
// Output consists of 2 integers.
// The first integer corresponds to the number of students in the each team.
// The second integer corresponds to the remaining students.

// Sample Input:
// 60
// 8

// Sample Output:
// The number of students in each team is 7 and left out is 4

import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner ar = new Scanner(System.in);
    int total = ar.nextInt();
    int teams = ar.nextInt();
    int num = total / teams;
    int left = total % teams;
    System.out.println("The number of students in each team is " + num + " and left out is " + left);
  }
}
