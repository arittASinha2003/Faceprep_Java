// Description:
// Mango tree I
// Dora is interested so much in gardening and she plants more trees in her garden. She plants trees in a rectangular fashion with the order of rows and columns and numbered the trees in row-wise order. She planted the mango tree only in a 1st row, 1st column and last column. So given the tree number, your task is to find whether the given tree is a mango tree or not? Write a java program to check whether the given number is a mango tree or not.

// Input Format:
// Input consists of 3 integers
// The first input denotes the number of rows
// The second input denotes the number of columns
// The third input denotes the tree number

// Output Format:
// If the given number is a mango tree, print "Yes". Otherwise, print "No"
// Refer the sample output for formatting

// Sample Input:
// 5
// 5
// 11

// Sample Output:
// Yes

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int rows = ar.nextInt();
        int columns = ar.nextInt();
        int treeNumber = ar.nextInt();

        if (isMangoTree(rows, columns, treeNumber)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean isMangoTree(int rows, int columns, int treeNumber) {
        // Check if the tree is in the first row
        if (treeNumber <= columns) {
            return true;
        }

        // Check if the tree is in the first or last column
        int column = treeNumber % columns;
        if (column == 1 || column == 0) {
            return true;
        }

        return false;
    }
}
