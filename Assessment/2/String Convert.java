// Description:
// John has two strings a and b, each of length n, and an integer k. The strings only contain lowercase English letters. He wants to convert string a into string b by performing some (possibly zero) operations on a.
// In one move, he can either
// • choose an index i (1 <= i <= n-1) and swap a[i] and a[i+1] or
// • choose an index i (1 <= i <= n-k+1) and if a[i], a[i+1],..., a[i+k-1] are all equal to some character c (c ≠ 'z'), replace each one with the next character (c+1) i.e. 'a' is replaced by 'b', 'b' is replaced by 'c' and so on.

// Input Format:
// First line - n and k
// then two strings a and b each of length n.

// Output Format:
// For each test case, print "Yes" if John can convert a into b after some moves, else print "No".

// Sample Input 1:
// 6 2
// aaabba
// ddddcc

// Sample Output 1:
// Yes

// Sample Input 2:
// 2 1 zz aa

// Sample Output 2:
// No

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int n = ar.nextInt();
        int k = ar.nextInt();
        ar.nextLine();
        String a = ar.nextLine();
        String b = ar.nextLine();
        int[] freqA = new int[26];
        int[] freqB = new int[26];
        for (int i = 0; i < n; i++) {
            freqA[a.charAt(i) - 'a']++;
            freqB[b.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 25; i++) {
            if (freqA[i] < freqB[i]) {
                System.out.println("No");
                return;
            }
            int diff = freqA[i] - freqB[i];
            if (diff % k != 0) {
                System.out.println("No");
                return;
            }
            freqA[i + 1] += diff;
        }
        System.out.println("Yes");
    }
}
