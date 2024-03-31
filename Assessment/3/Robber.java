// Description:
// You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night. Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.

// Input Format:
// The first line consists of size of an array
// The second line consists of array of elements separated by space

// Output Format:
// The output consists of maximum amount stolen

// Constraints:
// 1 <= n <= 10
// 1 <= Ai <= 10000

// Sample Input 1:
// 4
// 11 12 13 11

// Sample Output 1:
// 24

// Explanation:
// Rob house 1 (money = 11) and then rob house 3 (money = 13).
// Total amount you can rob = 11 + 13 = 24.

// Sample Input 2:
// 6 9 3 5 8 2 4

// Sample Output 2:
// 21

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int n = ar.nextInt();
        int[] money = new int[n];
        for (int i = 0; i < n; i++) {
            money[i] = ar.nextInt();
        }

        if (n == 1) {
            System.out.println(money[0]);
            return;
        }

        int[] dp = new int[n];
        dp[0] = money[0];
        dp[1] = Math.max(money[0], money[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], money[i] + dp[i - 2]);
        }

        System.out.println(dp[n - 1]);
    }
}
