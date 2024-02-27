// Description:
// Write a Java program to remove duplicate letters in the given string and print them in ascending order using set.

// Input Format:
// Input consists of String.

// Output Format:
// Output consists of Character set.

// Sample Input:
// Iron Man

// Sample Output:
// [ , a, i, m, n, o, r]

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);

        String input = ar.nextLine();

        Set<Character> set = new TreeSet<>();
        for (char c : input.toLowerCase().toCharArray()) {
            set.add(c);
        }

        System.out.println(set);
    }
}
