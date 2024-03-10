// Description:
// Use scanner name as ar, class name as Main, and don't use print statements before taking user inputs.

// John likes to solve every problem he encounters, one day he is passing by a street and he saw someone asking a problem by a boy so he decided to solve it first and then for surety he will give the solution to that person and ask if it is correct or not.

// The Question goes like this :

// A boy has an array A of n positive integers indexed from 1 to n and at ith index the present is A[i].

// Additionally the Boy has m queries to the array, each query is characterized by a pair of integers l[j] and r[j] (1 ≤l[j] ≤ r[j] ≤ n). For each query l[j], r[j] the Little Elephant has to count, how many numbers x exist, such that number x occurs exactly x times among numbers A[ l[j] ], A[ l[j + 1] ], . . ., A[ r[j] ].

// Help the boy to count the answers to all queries.



// Input Format :



// The first line contains two space-separated integers n and m (1 ≤ n, m ≤ 10^4) — the size of array a and the number of queries to it.

// The next line contains n space-separated positive integers A1, A2, . . . , An (1 ≤ Ai ≤ 10^7).

// Next m lines contain descriptions of queries, one per line. The j-th of these lines contains the description of the j-th query as two space-separated integers l[j] and r[j] (1 ≤ l[j] ≤ r[j] ≤ n).



// Output Format :

// In m lines print m integers — the answers to the queries. The j-th line should contain the answer to the j-th query.



// Sample Input :

// 7 2

// 3 1 2 2 3 3 7

// 1 7

// 3 4



// Sample Output :

// 3

// 1

// Input
// 7 2 3 1 2 2 3 3 7 1 7 3 4
// Output
// 3
// 1

// Input
// 10 3 1 4 2 4 2 4 2 4 2 4 1 10 1 5 2 8
// Output
// 1
// 2
// 1

// Input
// 6 6 1 2 2 3 3 3 1 2 2 2 1 3 2 4 4 6 1 6
// Output
// 1
// 0
// 2
// 1
// 1
// 3

// Input
// 1 2 1 1 1 1 1
// Output
// 1
// 1

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int n = ar.nextInt();
        int m = ar.nextInt();
        int[] A = new int[n+1];
        for(int i=1; i<=n; i++) {
            A[i] = ar.nextInt();
        }
        int[][] queries = new int[m][2];
        for(int i=0; i<m; i++) {
            queries[i][0] = ar.nextInt();
            queries[i][1] = ar.nextInt();
        }
        for(int[] query : queries) {
            System.out.println(countNumbers(A, query[0], query[1]));
        }
    }

    public static int countNumbers(int[] A, int l, int r) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int i=l; i<=r; i++) {
            countMap.put(A[i], countMap.getOrDefault(A[i], 0) + 1);
        }
        int count = 0;
        for(Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if(entry.getKey().equals(entry.getValue())) {
                count++;
            }
        }
        return count;
    }
}
