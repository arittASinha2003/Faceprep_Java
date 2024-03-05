// Description:
// Sece Dinning
// The catering staff in the SECE mess are known for their good cooking skills as well as hospitality. We all know that the dining table arrangement needs to be different for left-handed and right-handed persons. So whenever any VIP guests come to SECE, they would make the table arrangements based on whether they are left-handed or right-handed. The mess is situated on the 15th floor of the hostel building. SECE hostel building has super-fast elevators to help to travel from one floor to another. Each elevator has 2 doors, the front one and the rear one. If a person enters the elevator through the front door, he goes out through the rear door and vice-versa. The elevator has 2 rails numbered as 1 and 2. Rail 1 is located to the left of the entrance to the front door (or correspondingly, to the right of the entrance to the rear door). Rail 2 is located opposite it, to the right of the entrance to the front door and to the left of the entrance to the rear door. We know that each person holds on the rail with his/her strongest hand. There is an IP camera in the elevator and based on the camera output, the catering staff will be easily able to identify whether a guest is left-handed or right-handed. They have decided to automate this task and they asked the help of Image Processing Group. The Image Processing Group has written a program to perform this task and the program will output the door through which the person entered and the rail number which the person held. Based on this input, write a program to determine whether a person is left-handed or right-handed?

// Input Format:
// The first input containing a string denotes “front” or “rear”
// The second input containing an integer denotes rail 1 or 2

// Output Format:
// Print the string "Left Handed" or "Right Handed"

// Sample Input:
// front
// 1

// Sample Output:
// Left Handed

// Input (stdin):
// rear
// 1

// Output (stdout):
// Right Handed

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        String door = ar.nextLine();
        int rail = ar.nextInt();
        
        if (door.equals("front")) {
            if (rail == 1) {
                System.out.println("Left Handed");
            } else {
                System.out.println("Right Handed");
            }
        } else {
            if (rail == 1) {
                System.out.println("Right Handed");
            } else {
                System.out.println("Left Handed");
            }
        }
    }
}
