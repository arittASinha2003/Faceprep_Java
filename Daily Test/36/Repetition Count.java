// Description:
// Gowri is doing her homework. She needs to write a paragraph about Modern History. During that time, she noticed that some words are get repeated again and again. She started counting the number of times a particular word gets repeated. Write a java program to get a string from the user. Count the number of times a word gets repeated in the string.

// Input Format:
// The first line consists of a string
// The second line consists of a string

// Output Format:
// Refer sample output for formatting specifications

// Sample Input:
// I felt happy because I saw the others were happy and because I knew I should feel happy
// happy

// Sample Output:
// 3

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        String sentence = ar.nextLine();
        String word = ar.nextLine();

        String[] words = sentence.split("\\s+");
        int count = 0;

        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
