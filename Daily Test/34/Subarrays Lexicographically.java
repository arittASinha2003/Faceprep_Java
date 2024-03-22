// Description:
// All Subarrays Lexicographically
// Program to find all subarrays of a string and print it in sorted order. In this program, all the subarrays of the string need to be printed. The subarray is a contiguous part of a string. All the possible subarrays for a string will be n(n+1)/2. For example, all possible subsets of a string "FUN" will be F, U, N, FU, UN, FUN.

// Input Format:
// Input consist of a String

// Otput Format:
// Output consist of a String

// Sample Input:
// java

// Output Format:
// a
// a
// av
// ava
// j
// ja
// jav
// java
// v
// va

// Input:
// cor

// Output:
// c
// co
// cor
// o
// or
// r

// Input:
// cuytk

// Output:
// c
// cu
// cuy
// cuyt
// cuytk
// k
// t
// tk
// u
// uy
// uyt
// uytk
// y
// yt
// ytk

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        String str = ar.nextLine();
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                result.add(str.substring(i, j));
            }
        }

        Collections.sort(result);

        for (String s : result) {
            System.out.println(s);
        }
    }
}
