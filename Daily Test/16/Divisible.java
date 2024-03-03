// Description:
// Get a number(Integer) from the user and write a java program to check whether the given number is divisible by the sum of the digits of the same number. If the number is divisible, then print "Yes" or if the number is not divisible by the sum of its digits, then print "No".

// Input Format:
// Input consists of a integer value

// Output Format:
// Refer sample output for formatting specifications

// Sample Input:
// 200

// Sample Output:
// Yes

// Input:
// 345

// Output:
// No

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int num = ar.nextInt();
        int temp = num;
        int sum = 0;
        while(temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if(num % sum == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
