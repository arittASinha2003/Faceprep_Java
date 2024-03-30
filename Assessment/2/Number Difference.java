// Description:
// Developers at the mobile company 'TalkFree' have designed a game for the launch of their new product. In the game, the player is given a number. The player has to find out the difference between the number and the reverse of the number. The difference between the two numbers is the player's score. The number given to the player and the player's score can either be a negative or positive number.
// Write an algorithm to find the player's score.

// Input Format:
// The input consists of an integer - numberPlayer representing the number given to the player.

// Output Format:
// Print an integer representing the player's score.

// Constraint:
// -109 < numberPlayer < 109

// Sample Input 1:
// 1234

// Sample Output 1:
// -3087

// Explanation:
// The reverse of 1234 is 4321.
// Difference 1234-4321 = -3087
// Hence the output is -3087

// Sample Input 2:
// 100

// Sample Output 2:
// 99

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int numberPlayer = ar.nextInt();
        int reversedNumber = reverse(numberPlayer);
        int score = numberPlayer - reversedNumber;
        System.out.println(score);
    }

    static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }
}
