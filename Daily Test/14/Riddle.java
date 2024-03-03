// Description:
// Here comes a riddle!... Your friend says, "The lions in Mangroove forest keep breeding uncontrollably so it's difficult to track their age. I can tell how old an entire family is but not individual age. Two lion cubs are of the same age. Their father is X years older than them. The combined age of the three is Y. Calculate their individual ages." Write a java program to find the solution for this riddle.

// Input Format:
// First input corresponds to the father's age older than cubs age (Integer)
// Second input corresponds to the combined age of father lion and it's cubs (Integer)

// Output Format:
// Output corresponds to the individual of them

// Sample Input:
// 10
// 40

// Sample Output:
// Father lion's age is 20
// Cub's age is 10

// Input:
// 1
// 3

// Output:
// Father lion's age is 1
// Cub's age is 0

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int fatherOlder = ar.nextInt();
        int combinedAge = ar.nextInt();

        int cubsAge = (combinedAge - fatherOlder) / 3;
        int fatherAge = cubsAge + fatherOlder;

        System.out.println("Father lion's age is " + fatherAge);
        System.out.println("Cub's age is " + cubsAge);
    }
}
