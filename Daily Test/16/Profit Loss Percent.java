// Description:
// Jammy and Lily were friends. Jammy needs help from Lily and he says, "At the end of each day, I need to calculate if we have incurred a profit or a loss. Each day, I am assigned Rs.X to run the counter. At the end of the day, we earn Rs.Y through the counter. Could you calculate and tell me if we've had a profit or loss and by how much %." Write a Java program to find the solution for Jammy's question.

// Input Format:
// First input corresponds to the assigned amount by Jammy (Integer)
// Second input corresponds to the earned amount (Integer)

// Output Format:
// Output corresponds to the profit or loss in terms of percentage

// Sample Input:
// 1200
// 1500

// Sample Output:
// Profit - 25%

// Input:
// 1220
// 0

// Output:
// Invalid Data

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int assignedAmount = ar.nextInt();
        int earnedAmount = ar.nextInt();

        if (assignedAmount <= 0 || earnedAmount < 0) {
            System.out.println("Invalid Data");
        } else if (earnedAmount == 0) {
            System.out.println("Invalid Data");
        } else {
            double percentage = ((double) (earnedAmount - assignedAmount) / assignedAmount) * 100;
            if (percentage < 0) {
                System.out.println("Loss - " + Math.round(Math.abs(percentage)) + "%");
            } else {
                System.out.println("Profit - " + Math.round(percentage) + "%");
            }
        }
    }
}
