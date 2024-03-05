// Description:
// Write a Java program for the following series 462 420 380 342 306.....

// Input Format:
// Inputs correspond to the number of terms (Integer)

// Output Format:
// Refer the sample output

// Sample Input 1:
// 5

// Sample Output 1:
// 462 420 380 342 306

// Input:
// 0

// Output:
// Invalid Data

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int n = ar.nextInt();
        int d = 42;
        int in = 462;
        if (n <= 0) {
            System.out.print("Invalid Data");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(in + " ");
                in = in - d;
                d -= 2;
            }
        }
        ar.close();
    }
}
