// Description:
// Lab Allocation I
// There are 3 labs in the CSE department(L1, L2, and L3) with a seating capacity of x, y, and z respectively. Find the lab which has minimal seating capacity. 

// Input Format:
// Input consists of 3 integers.
// The first input denotes the seating capacity of L1(x)
// The second input denotes the seating capacity of L2(y)
// The third input denotes the seating capacity of L3(z)

// Output Format:
// Print the minimal seating lab capacity

// Sample Input:
// 30
// 40
// 20

// Sample Output:
// L3

// Logic: If two or more labs have the same smallest capacity, it will print the one that comes last in the order L1, L2, L3.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        
        int x = ar.nextInt();
        int y = ar.nextInt();
        int z = ar.nextInt();
        
        if (z <= x && z <= y) {
            System.out.println("L3");
        } else if (y <= x && y <= z) {
            System.out.println("L2");
        } else {
            System.out.println("L1");
        }
    }
}
