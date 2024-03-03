// Description:
// Lab Allocation II
// There are 3 labs in the CSE department are L1, L2, and L3 with a seating capacity of x, y, and z respectively. One of the 3 labs has been allocated for FACE training. Out of the available labs, find the lab which has minimal seating capacity.

// Input Format:
// Input consists of 3 integers and a string
// The first input denotes the seating capacity of L1(x)
// The second input denotes the seating capacity of L2(y)
// The third input denotes the seating capacity of L3(z)
// The fourth input denotes the lab which is allocated for FACE training

// Output Format:
// Print the minimal seating capacity lab amongst the available labs.

// Sample Input:
// 30
// 40
// 20
// L3

// Sample Output:
// L1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        
        int x = ar.nextInt();
        int y = ar.nextInt();
        int z = ar.nextInt();
        String faceLab = ar.next();
        
        if (faceLab.equals("L1")) {
            x = Integer.MAX_VALUE;
        } else if (faceLab.equals("L2")) {
            y = Integer.MAX_VALUE;
        } else if (faceLab.equals("L3")) {
            z = Integer.MAX_VALUE;
        }
        
        if (z <= x && z <= y) {
            System.out.println("L3");
        } else if (y <= x && y <= z) {
            System.out.println("L2");
        } else {
            System.out.println("L1");
        }
    }
}
