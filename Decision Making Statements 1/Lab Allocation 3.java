// Description:
// Lab Allocation III
// There are 3 labs in the CSE department are L1, L2, and L3 with a seating capacity of x, y, and z. A single lab needs to be allocated to a class of 'n' students. How many of the 3 labs can accommodate 'n' students?

// Input Format:
// Input consists of 4 integers
// The first input denotes the seating capacity of L1(x)
// The second input denotes the seating capacity of L2(y)
// The third input denotes the seating capacity of L3(z)
// The fourth input denotes the number of students(n)

// Output Format:
// Print the number of labs which can accommodate the 'n' number of students
// Refer the Sample output for formatting

// Sample Input:
// 30
// 40
// 20
// 25

// Sample Output:
// 2

// Input (stdin):
// 30
// 40
// 20
// 50

// Output (stdout):
// 0

// Input (stdin):
// 60
// 30
// 90
// 20

// Output (stdout):
// 3

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int L1 = ar.nextInt();
        int L2 = ar.nextInt();
        int L3 = ar.nextInt();
        int n = ar.nextInt();
        int count = 0;
        if(L1 >= n) count++;
        if(L2 >= n) count++;
        if(L3 >= n) count++;
        System.out.println(count);
    }
}
