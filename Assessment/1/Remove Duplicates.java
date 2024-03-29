// Description:
// Jack and John were investigating a murder and the murderer was Ms.Isha Adler. She wanted Jack to find her by solving the puzzles. Jack was able to solve all but one. The last task was to write a program to remove duplicate elements from an array. Can you help Jack?

// Input Format:
// Input consists of 1 integer and 1 array. The first integer corresponds to the size of the array. The next integers correspond to the elements in the array.

// Output Format:
// The output consists of an array with no duplicate elements.

// Sample Input:
// 5
// 1
// 2
// 2
// 3
// 4

// Sample Output:
// 1
// 2
// 3
// 4

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int n = ar.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = ar.nextInt();
        }
        Set<Integer> set = new LinkedHashSet<>();
        for(int num : arr) {
            set.add(num);
        }
        for(int num : set) {
            System.out.println(num);
        }
    }
}
