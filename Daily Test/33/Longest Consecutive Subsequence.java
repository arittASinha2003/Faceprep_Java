// Description:
// Given an array A of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.

// Input:
// N = 7
// 2 6 1 9 4 5 3

// Output:
// 6

// Explanation:
// The consecutive numbers here are 1, 2, 3, 4, 5, 6. These 6 numbers form the longest consecutive subsquence.

// Input:
// N = 7
// 1 9 3 10 4 20 2

// Output:
// 4

// Explanation:
// 1, 2, 3, 4 is the longest consecutive subsequence.

// Constraints:
// 1 <= N <= 10^5
// 0 <= A[i] <= 10^5

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int N = ar.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = ar.nextInt();
        }
        System.out.println(findLongestConseqSubseq(A, N));
    }

    static int findLongestConseqSubseq(int A[], int N) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int ans = 0;

        for (int i = 0; i < N; i++)
            hs.add(A[i]);

        for (int i = 0; i < N; i++) {
            if (!hs.contains(A[i] - 1)) {
                int j = A[i];
                while (hs.contains(j)) {
                    j++;
                }

                if (ans < j - A[i])
                    ans = j - A[i];
            }
        }
        return ans;
    }
}
