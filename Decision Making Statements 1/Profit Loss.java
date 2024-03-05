// Description?:
// A fruit seller buys a dozen of banana at Rs.X. He sells 1 banana at Rs.Y. Write a java program to determine the profit or loss in Rs. for the fruitseller.
// Input Format:
// Input consists of 2 floating point numbers
// The first input corresponds to the total cost(X)
// The second input corresponds to the sold cost(Y)

// Output Format:
// Print "Profit or Loss" with Rupees.

// Sample Input:
// 60
// 4

// Sample Output:
// Loss : Rs.12.00

// Input (stdin):
// 60.0
// 5

// Output (stdout):
// No profit nor loss

// import java.util.Scanner;
// import java.text.DecimalFormat;

// public class Main {
//     public static void main(String[] args) {
//         Scanner ar = new Scanner(System.in);
//         double X = ar.nextDouble();
//         double Y = ar.nextDouble();
//         double costPrice = X / 12;
//         double profitOrLoss = Y - costPrice;
//         DecimalFormat df = new DecimalFormat("0.00");

//         if (profitOrLoss > 0) {
//             System.out.println("Profit : Rs." + df.format(profitOrLoss * 12));
//         } else if (profitOrLoss < 0) {
//             System.out.println("Loss : Rs." + df.format(-profitOrLoss * 12));
//         } else {
//             System.out.println("No profit nor loss");
//         }
//     }
// }

import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner ar = new Scanner(System.in);
        float a = ar.nextFloat();
        float b = ar.nextFloat();
        if(a > (b * 12))
        System.out.printf("Loss : Rs.%.2f",(a - b * 12));
        else if(a < (b * 12))
        System.out.printf("Profit : Rs.%.2f",(a - b * 12));
        else
        System.out.println("No profit nor loss");
    }
}
