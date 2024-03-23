// Description:
// Write a program to find the most occurring character in the string.

// Input Format:
// First line consists of a string s

// Output Format:
// Output consists of a character value

// Sample Input:
// Happy coding

// Sample Output:
// p

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        String s = ar.nextLine();
        int[] freq = new int[256];
        char result = ' ';
        int max = -1;

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
            if (max < freq[s.charAt(i)]) {
                max = freq[s.charAt(i)];
                result = s.charAt(i);
            }
        }
        System.out.println(result);
    }
}
