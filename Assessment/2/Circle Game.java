// Description:
// There are n people standing in a circle waiting to be executed. The counting begins at some point in the circle and proceeds around the circle in a fixed direction. In each step, a certain number of people are skipped and the next person is executed. The elimination proceeds around the circle (which is becoming smaller and smaller as the executed people are removed), until only the last person remains, who is given freedom. Given the total number of persons n and a number k which indicates that k-1 persons are skipped and kth person is killed in a circle. The task is to choose the place in the initial circle so that you will be the only remaining person alive.

// Input Format:
// The first line consists of an integer value which is total number of people.
// The second line consists of kth person to be killed in a circle.

// Output Format:
// We have to obtain the required position in the initial circle.

// Constraints:
// 1 <= N <= 100000
// 1 <= k <= 500

// Sample Input 1:
// 100
// 2

// Sample Output 1:
// 73

// Sample Input 2:
// 14
// 2

// Sample Output 2:
// 13

// Sample Input 3:
// 300
// 5

// Sample Output 3:
// 113

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int n = ar.nextInt();
        int k = ar.nextInt();
        System.out.println(josephus(n, k));
    }

    static int josephus(int n, int k) {
        if (n == 1)
            return 1;
        else
            return (josephus(n - 1, k) + k-1) % n + 1;
    }
}
