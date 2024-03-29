// Description:
// In a certain area, there was a camp of polio drops team. They need to search for every baby in a particular area. They want to find the baby and take out the baby for polio drops. Help them to find the baby to avoid polio attacks. (Remove the occurrence of the word "the" from the entered string).

// Input Format:
// The input is a string.

// Output Format:
// The output is a string.

// Sample Input 1:
// remove the occurrence of the word from an entered string

// Sample Output 1:
// remove occurrence of word from an entered string

// Explanation:
// Here we will eliminate the word the from the input string and prints the remaining.

// Sample Input 2:
// remove the bad things the

// Sample Output 2:
// remove bad things

// Explanation:
// Here we will eliminate the word the from the input string and prints the remaining.

// Sample Input 3:
// hello

// Sample Output 3:
// hello

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        String input = ar.nextLine();
        String output = input.replaceAll("\\bthe\\b", "").trim().replaceAll(" +", " ");
        System.out.println(output);
    }
}
