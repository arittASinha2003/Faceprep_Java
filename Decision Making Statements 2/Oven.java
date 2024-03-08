// Description:
// Microwave Oven
// A microwave oven manufacturer recommends that when heating two items, add 50% to the heating time, and when heating three items double the heating time. Heating more than three items at once is not recommended. Write a program to find out the recommended heating time.

// Input Format:
// The first input containing an integer which denotes the number of items
// The second input containing the floating point number which denotes the single item heating time.

// Output Format:
// Print the recommended heating time in floating point with 2 decimal places.
// If the number of items is more than three, print "Number of items is more" 

// Sample Input:
// 2
// 5.0

// Sample Output:
// 7.50

// Input (stdin):
// 4
// 5.0

// Output (stdout):
// Number of items is more

// Input (stdin):
// 3
// 7.0

// Output (stdout):
// 14.00

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int items = ar.nextInt();
        double time = ar.nextDouble();

        if (items > 3) {
            System.out.println("Number of items is more");
        } else if (items == 2) {
            System.out.printf("%.2f", time * 1.5);
        } else if (items == 3) {
            System.out.printf("%.2f", time * 2);
        } else {
            System.out.printf("%.2f", time);
        }
    }
}
