import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check if the number is an Armstrong number
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int numDigits = String.valueOf(num).length();

        // Calculate the sum of the digits raised to the power of the number of digits
        while (num != 0) {
            int digit = num % 10;
            sum += power(digit, numDigits);
            num /= 10;
        }

        // Check if the sum is equal to the original number
        return sum == originalNum;
    }

    // Method to calculate the power without using Math.pow
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}


// 1 
// 3
//  =1 (calculated by power(1, 3))
// 5
// 3
// =
// 125
// 5 
// 3
//  =125 (calculated by power(5, 3))
// 3
// 3
// =
// 27
// 3 
// 3
//  =27 (calculated by power(3, 3))
// Sum: 
// 1
// +
// 125
// +
// 27
// =
// 153
// 1+125+27=153