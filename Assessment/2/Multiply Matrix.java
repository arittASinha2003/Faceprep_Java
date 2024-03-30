// Description:
// Write a program to multiply two matrices of the same dimensions together.

// Input Format:
// The first two integer inputs, m, and n represent the dimensions of both of the matrices that have to be multiplied. Next (m*n) integers represent the elements in the first matrix and followed by another (m*n) integer representing the elements in the second matrix

// Output Format:
// The output consists of (m*n) integers representing the values of the matrix that is the product of both the input matrices.

// Sample Input 1:
// 3 3
// 1 2 3
// 4 5 6
// 7 8 9
// 9 8 7
// 6 5 4
// 3 2 1

// Sample Output 1:
// 30 24 18
// 84 69 54
// 138 114 90

// Sample Input 2:
// 3 3 4 5 1 9 8 5 2 5 8 1 2 3 4 5 6 7 8 9

// Sample Output 2:
// 31 41 51
// 76 98 120
// 78 93 108

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int m = ar.nextInt();
        int n = ar.nextInt();
        int[][] firstMatrix = new int[m][n];
        int[][] secondMatrix = new int[m][n];
        int[][] resultMatrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                firstMatrix[i][j] = ar.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                secondMatrix[i][j] = ar.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
