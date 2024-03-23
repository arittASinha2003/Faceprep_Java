// Description:
// Run Length Encoding
// Implement run-length encoding. Run-length encoding (RLE) is a simple form of data compression, where runs (consecutive data elements) are replaced by just one data value and count.
// "WWBWWWBBBWWWWB" -> "2WB3W3B4WB"
// Write a program for this to encode the characters.

// Sample Input 1:
// "WWBWWWBBBWWWWB"

// Sample Output 1:
// 2WB3W3B4WB

// Sample Input 2:
// A

// Sample Output 2:
// A

// Input:
// WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWB

// Output:
// 12WB12W3B24WB

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        String input = ar.nextLine();
        System.out.println(runLengthEncoding(input));
    }

    public static String runLengthEncoding(String str) {
        int n = str.length();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                i++;
                count++;
            }
            if (count > 1) {
                result.append(count);
            }
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
