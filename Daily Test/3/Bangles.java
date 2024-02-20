// Description:
// Naveen bought 2 bangles for his elder sister Ragavi, as a birthday gift. Before presenting the gift, Naveen challenges his sister to answer his question blindfolded. He places both the bangles on the table and asks Ragavi to answer two questions: 1) Are the two bangles intersecting or touching or not touching? 2) What is the distance between the centers of the bangles? To answer these questions, Naveen gives the centers Cl(x1, y1) and C2(x2, y2) and radius R1 and R2 of the bangles. Now write a java program to help Ragavi to answer her brother's questions.

// Input format:
// First line of the input consists of two integers separated by a space which corresponds to x1 and yl values, respectively.
// Second line of the input consists of two integers separated by a space which corresponds to x2 and y2 values, respectively.
// Third line of the input consists of two integers separated by a space which corresponds to R1 and R2 values, respectively.

// Output Format:
// First line of the Output is a string, "Intersects" or "Touches" or "Do not Touch".
// Second line of the output is a float value which corresponds to the distance between the two centers of the bangles, Rounded-off to 2 decimal points.

// Sample Input 1:
// 3 4
// 14 18
// 5 8

// Sample Output 1:
// Do not Touch
// 17.80

// Sample Input 2:
// 3 4
// 4 6
// 4 5

// Sample Output 2:
// Intersects
// 2.24

// Sample Input 3:
// 1 1
// 3 1
// 1 1

// Sample Output 3:
// Touches
// 2.00

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double roundedDistance = Math.round(distance * 100.0) / 100.0;
        
        if (distance < r1 + r2) {
            System.out.println("Intersects");
        } else if (distance == r1 + r2) {
            System.out.println("Touches");
        } else {
            System.out.println("Do not Touch");
        }
        
        System.out.printf("%.2f\n", roundedDistance);
    }
}
