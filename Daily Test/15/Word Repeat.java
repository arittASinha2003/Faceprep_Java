// Description:
// Gowri is doing her homework. She needs to write a paragraph about Modern History. During that time, she noticed that some words are getting repeated again and again. She started counting the number of times of particular word getting repeated. Write a java program to get a string from the user. Count the number of times a word gets repeated in the string.

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

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        
        // Read the string from the user
        String str = ar.nextLine();
        
        // Read the word from the user
        String word = ar.nextLine();
        
        // Split the string into words
        String[] words = str.split("\\s+");
        
        // Initialize the count to 0
        int count = 0;
        
        // Iterate over the words
        for (String w : words) {
            // If the word matches the user's word, increment the count
            if (w.equals(word)) {
                count++;
            }
        }
        
        // Print the count
        System.out.println(count);
    }
}
