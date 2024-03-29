// Description:
// A company transfers an encrypted code to one of its clients. The code needs to be decrypted so that it can be used for accessing all the required information. The code can be decrypted by interchanging each consecutive digit and once a digit has been interchanged then it cannot be used again. If at a certain point there is no digit to be interchanged with, then the single digit must be left as it is.

// Write an algorithm to decrypt the code so that it can be used to access the required information.

// Input Format:
// The first line of the input consists of an integer - encrypted code, representing the encrypted code given to the client.

// Output Format:
// Print an integer representing the decrypted code that can be used for accessing the required information

// Sample Input 0:
// 39631

// Sample Output 0:
// 93361

// Explanation:
// Step 1 - Interchange the first two digits, 3 and 9, which form 93631.
// Step 2 - Interchange the third and fourth digits, 6 and 3 which form 93361.
// Step 3 - For the fifth digit as there is no digit to be interchanged with, it is left it is so it will be kept as 93361.
// So, the output is 93361.

// Sample Input 1:
// 1234

// Sample Output 1:
// 2143

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        String encryptedCode = ar.next();
        char[] codeArray = encryptedCode.toCharArray();
        for (int i = 0; i < codeArray.length - 1; i += 2) {
            char temp = codeArray[i];
            codeArray[i] = codeArray[i + 1];
            codeArray[i + 1] = temp;
        }
        String decryptedCode = new String(codeArray);
        System.out.println(decryptedCode);
    }
}
