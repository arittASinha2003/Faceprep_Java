// Description:
// Mr. Bean has saved an image in a 2D array and he wants to rotate the image by 90 degrees in clockwise direction. Please help him code for array rotation by 90 degrees in clockwise direction.

// Input Format:
// The first line contains the size of the matrix N. The next N lines contain the elements of the matrix

// Output Format:
// The output prints the rotated matrix

// Sample Input 1:
// 3
// 1 2 3
// 4 5 6
// 7 8 9

// Sample Output 1:
// 7 4 1
// 8 5 2
// 9 6 3

// Sample Input 2:
// 3 -5 -10 -4 3 -6 3 -1 0 -6

// Sample Output 2:
// -1 3 -5
// 0 -6 -10
// -6 3 -4

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int N = ar.nextInt();
        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = ar.nextInt();
            }
        }

        for (int i = 0; i < N / 2; i++) {
            for (int j = i; j < N - i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[N - 1 - j][i];
                matrix[N - 1 - j][i] = matrix[N - 1 - i][N - 1 - j];
                matrix[N - 1 - i][N - 1 - j] = matrix[j][N - 1 - i];
                matrix[j][N - 1 - i] = temp;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
