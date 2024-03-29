// Description:
// Write a java program to find max element using recurrence

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = ar.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = ar.nextInt();
        }
        int maxElement = findMax(array, size - 1);
        System.out.println("Maximum element in the array is " + maxElement);
    }

    public static int findMax(int[] array, int index) {
        if (index > 0) {
            return Math.max(array[index], findMax(array, index - 1));
        } else {
            return array[0];
        }
    }
}
