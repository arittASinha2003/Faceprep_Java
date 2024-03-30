// Description:
// Write a program to implement Tower of Hanoi.
// It consists of three rods and a number of disks of different sizes which can slide onto any rod.
// The puzzle starts with the disks in a neat stack in ascending order of size on one rod, the smallest at the top.
// We have to obtain the same stack on the third rod.

// Input Format:
// One line contain number of disks a(1 <= a <= 13).

// Output Format:
// Sequence of moves throughout the process (for better understanding refer to sample output section).

// Sample Input 1:
// 3

// Sample Output 1:
// The sequence of moves involved in the Tower of Hanoi are :

// 1 A C
// 2 A B
// 1 C B
// 3 A C
// 1 B A
// 2 B C
// 1 A C

// Explanation:
// 1 A C means - Move disk 1 from A to C.

// Sample Input 2:
// 1

// Sample Output 2:
// The sequence of moves involved in the Tower of Hanoi are :

// 1 A C

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int n = ar.nextInt();
	System.out.println("The sequence of moves involved in the Tower of Hanoi are :");
	System.out.println();
        towerOfHanoi(n, 'A', 'C', 'B');
    }

    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        if (n == 1) {
            System.out.println("1 " + from_rod + " " + to_rod);
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println(n + " " + from_rod + " " + to_rod);
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }
}
