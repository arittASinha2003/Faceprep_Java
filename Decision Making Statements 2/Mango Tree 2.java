// Description:
// Mango tree II
// Sara is interested so much in gardening and she plants more trees in her garden. She plants trees in a rectangular fashion with the order of rows and columns. She numbered the trees in column wise order and planted mango tree only in a 1st row, 1st column and last column. So given the tree number, write a program to find whether the given tree is a mango tree or not?

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
// 15

// Sample Output:
// No

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int rows = ar.nextInt();
        int columns = ar.nextInt();
        int treeNumber = ar.nextInt();

        int columnOfTree = (treeNumber - 1) / rows + 1;
        int rowOfTree = (treeNumber - 1) % rows + 1;

        if (rowOfTree == 1 || columnOfTree == 1 || columnOfTree == columns) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }
}
