// Description:
// Write a program to move all zeroes to the end of a given integer.

// Input Format:
// The first line of input contains a number of test cases T.
// For each test case, the first line of input contains a single integer of 0's and 1's.

// Constraints:
// 1 <= T <= 10
// 1 <= N <= 109

// Output Format:
// The output contains a single-line integer value.

// Sample Input 1:
// 2
// 1010101
// 1000111

// Sample Output 1:
// 1111000
// 1111000

// Sample Input 2:
// 1 1100110
// 1111000

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int T = ar.nextInt();
        while (T-- > 0) {
            String num = ar.next();
            int countZeroes = 0;
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < num.length(); i++) {
                if (num.charAt(i) == '0') {
                    countZeroes++;
                } else {
                    result.append(num.charAt(i));
                }
            }
            while (countZeroes-- > 0) {
                result.append('0');
            }
            System.out.println(result);
        }
    }
}
