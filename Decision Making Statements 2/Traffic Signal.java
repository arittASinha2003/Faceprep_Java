// Description:
// Traffic Signal
// We are driving down the street and see a green traffic light ahead. Because we know precisely the pattern of this traffic light, we know exactly how long we have before it will turn red. We wish to compute whether we will pass the traffic light before it turns red at our current speed. Write a java program to check whether we will beat the light or not with the current speed.

// Input Format:
// The first input containing the floating point number which denotes the current speed in miles per hour
// The second input containing the floating point number which denotes the distance to the light in miles 
// The third input containing the floating point number which denotes the time until it turns red in seconds

// Output Format:
// Print "Yes", if we will be able to beat the light at current speed. 
// Print "No", if we won't be able to beat light at current speed.

// Sample Input:
// 59.99
// 1
// 60

// Sample Output:
// No

// Input (stdin):
// 82.89
// 1
// 60

// Output (stdout):
// Yes

// Input (stdin):
// 50.6
// 2
// 60

// Output (stdout):
// No

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        double speed = ar.nextDouble();
        double distance = ar.nextDouble();
        double time = ar.nextDouble();

        // Convert speed from miles per hour to miles per second
        double speedInMps = speed / 3600;

        // Calculate the time it will take to reach the light
        double timeToReach = distance / speedInMps;

        // Check if we can beat the light
        if(timeToReach <= time) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
