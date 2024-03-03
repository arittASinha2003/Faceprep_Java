// Description:
// Hotel Tariff Calculator
// Write a java program to calculate the hotel tariff. The room rent is 20% high during peak seasons [April-June, November-December].  Note: Use the switch construct.

// Input Format:
// The first input containing an integer which denotes the number of the month
// The second input containing the floating point number which denotes the room rent per day
// The third input containing an integer which denotes the number of days stayed in the hotel

// Output Format:
// Print the hotel tariff to be paid in floating point with 2 decimal places
// Refer the sample output for formatting

// Sample Input:
// 3
// 1500
// 2

// Sample Output:
// 3000.00

// Input (stdin):
// 12
// 2500
// 2

// Output (stdout):
// 6000.00

// Input (stdin):
// 15
// 2000
// 3

// Output (stdout):
// Invalid Input

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int month = ar.nextInt();
        double rent = ar.nextDouble();
        int days = ar.nextInt();

        if(month < 1 || month > 12) {
            System.out.println("Invalid Input");
            return;
        }

        switch(month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                rent *= 1.2;
                break;
            default:
                break;
        }

        double total = rent * days;
        System.out.printf("%.2f", total);
    }
}
