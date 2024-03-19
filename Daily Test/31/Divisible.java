// Description:
// The teacher Olive Oyl conducted a competition between two students of the 6th-standard class, namely Popeye and Bluto. The competition is all about who will tell the numbers correctly from 1 to N that is divisible by 2,3 and 5. Help the teacher Olive Oyl to verify the answers given by the students.
// Write a code to print all the numbers from 1 to 'n' divisible by 2, 3, 5.

// Sample Input:
// 100

// Sample Output:
// 30 60 90

// Input:
// 200

// Output:
// 30 60 90 120 150 180

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int n = ar.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
