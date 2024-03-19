// Description:
// Write a Java code to find the sum of alternate digits from the first.

// Sample Input:
// 1234

// Sample Output:
// 4

// Input:
// 87654

// Output:
// 18

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        String num = ar.nextLine();
        int sum = 0;
        for (int i = 0; i < num.length(); i += 2) {
            sum += Character.getNumericValue(num.charAt(i));
        }
        System.out.println(sum);
    }
}
