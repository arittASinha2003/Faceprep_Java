// Description?:
// Lab Allocation IV
// There are 3 labs in the CSE department. The labs are L1, L2, and L3 with a seating capacity of x, y, and z respectively. A single lab needs to be allocated to a class of 'n' students. The labs need to be utilized to the maximum i.e the number of systems used should not be minimal. Which lab needs to be allocated to this class?

// Input Format:
// Input consists of 4 integers
// The first input denotes 'x'
// The second input denotes 'y'
// The third input denotes 'z'
// The fourth input denotes 'n'

// Output Format:
// Print the lab which is suitable for 'n' number of students
// Refer the Sample output for formatting

// Sample Input:
// 30
// 40
// 20
// 25

// Sample Output:
// L1

// Input (stdin):
// 30
// 40
// 20
// 15

// Output (stdout):
// L3

// Input (stdin):
// 90
// 50
// 60
// 40

// Output (stdout):
// L2

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner ar = new Scanner(System.in);
//         int L1 = ar.nextInt();
//         int L2 = ar.nextInt();
//         int L3 = ar.nextInt();
//         int n = ar.nextInt();
        
//         int unusedL1 = L1 >= n ? L1 - n : Integer.MAX_VALUE;
//         int unusedL2 = L2 >= n ? L2 - n : Integer.MAX_VALUE;
//         int unusedL3 = L3 >= n ? L3 - n : Integer.MAX_VALUE;
        
//         if (unusedL1 <= Math.min(unusedL2, unusedL3)) {
//             System.out.println("L1");
//         } else if (unusedL2 <= Math.min(unusedL1, unusedL3)) {
//             System.out.println("L2");
//         } else if (unusedL3 <= Math.min(unusedL1, unusedL2)) {
//             System.out.println("L3");
//         } else {
//             System.out.println("No lab can accommodate the given number of students");
//         }
//     }
// }

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        
        int L1 = ar.nextInt();
        int L2 = ar.nextInt();
        int L3 = ar.nextInt();
        int n = ar.nextInt();
        
        if (n < L1 && n < L2 && n < L3) {
            if (L1 < L2 && L1 < L3) {
                System.out.println("L1");
            } else if (L2 < L3) {
                System.out.println("L2");
            } else {
                System.out.println("L3");
            }
        } else if (n < L1 && n < L2) {
            if (L1 < L2) {
                System.out.println("L1");
            } else {
                System.out.println("L2");
            }
        } else if (n < L1 && n < L3) {
            if (L1 < L3) {
                System.out.println("L1");
            } else {
                System.out.println("L3");
            }
        } else if (n < L2 && n < L3) {
            if (L2 < L3) {
                System.out.println("L2");
            } else {
                System.out.println("L3");
            }
        } else if (n < L1) {
            System.out.println("L1");
        } else if (n < L2) {
            System.out.println("L2");
        } else if (n < L3) {
            System.out.println("L3");
        } else {
            System.out.println("0");
        }
    }
}
