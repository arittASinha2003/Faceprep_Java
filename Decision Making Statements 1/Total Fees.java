// Description:
// Fee collection
// Write a java program to determine the fee amount to be collected from a student.  Refer the table below for fee details. Student Type Student Type denoted as Fee Details   Merit Seat Day Scholar MSDS Tuition fee + Bus fee Merit Seat Hosteller MSH Tuition fee + Hostel fee Management Seat Day Scholar MGSDS 150% of Tuition fee + Bus fee Management Seat Hosteller MGSH 150% of Tuition fee + Hostel fee

// Input Format:
// The first input corresponds to the student type
// The second input corresponds to the tuition fee
// The third input corresponds to the bus fee
// The fourth input corresponds to the hostel fees

// Output Format:
// Print the total fee amount of the corresponding student with 2 decimal places. 
// Refer below sample output for formatting

// Sample Input:
// MSH
// 40000
// 12000
// 50000

// Sample Output:
// 90000.00

// Input (stdin):
// MSDS
// 50000
// 15000
// 60000

// Output (stdout):
// 65000.00

// Input (stdin):
// MSDS
// 50000
// 12000
// 20000

// Output (stdout):
// 62000.00

// Input (stdin):
// MSGH
// 5000
// 3000
// 2000

// Output (stdout):
// Invalid

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        
        String studentType = ar.nextLine();
        double tuitionFee = ar.nextDouble();
        double busFee = ar.nextDouble();
        double hostelFee = ar.nextDouble();
        
        double totalFee = 0.0;
        
        switch(studentType) {
            case "MSDS":
                totalFee = tuitionFee + busFee;
                break;
            case "MSH":
                totalFee = tuitionFee + hostelFee;
                break;
            case "MGSDS":
                totalFee = 1.5 * tuitionFee + busFee;
                break;
            case "MGSH":
                totalFee = 1.5 * tuitionFee + hostelFee;
                break;
            default:
                System.out.println("Invalid");
                System.exit(0);
        }
        
        System.out.printf("%.2f", totalFee);
    }
}
