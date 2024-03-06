// Description:
// Write a Java program to check whether the given matrix is symmetric or not. Get the row size and column size of the matrix and all the elements of the matrix from the user. [Note: A symmetric matrix is a matrix which is equal to its transpose. Only square matrices are said to be symmetric].

// Input Format:
// The first line consists of row size and column size of the matrix
// The next line consists of all the elements of the matrix

// Output Format:
// Refer sample output for formatting specifications

// Sample Input:
// 3 3
// 7 5 1
// 5 8 3
// 1 3 4

// Sample Output:
// The given matrix is symmetric

// Input:
// 3 4
// 11 13 16 17
// 21 24 26 29
// 32 37 33 31

// Output:
// Row and column are not equal

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int row = ar.nextInt();
        int col = ar.nextInt();

        if(row != col) {
            System.out.println("Row and column are not equal");
            return;
        }

        int[][] matrix = new int[row][col];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix[i][j] = ar.nextInt();
            }
        }

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < i; j++) {
                if(matrix[i][j] != matrix[j][i]) {
                    System.out.println("The given matrix is not symmetric");
                    return;
                }
            }
        }

        System.out.println("The given matrix is symmetric");
    }
}
