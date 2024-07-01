import java.util.Scanner;
public class amicable {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); {
            long num1,num2,fact,sum1=0,sum2=0;
            num1=sc.nextInt();
            num2=sc.nextInt();
            for(fact=1;fact<=num1/2;fact++){
                if(num1%fact==0)
                sum1=sum1+fact;
            }
            for(fact=1;fact<=num2/2;fact++){
                if(num2%fact==0)
                sum2=sum2+fact;
            }
            if(sum1==num2 && sum2==num1){
                System.out.print(" it is amicable");
            }
            else{
                System.out.println("it is not amicable");
            }
        
    
        }}}


//         Let's break down the code with an example. Suppose the user inputs 220 and 284.

// Reading Input:

// The user inputs two numbers: num1 = 220 and num2 = 284.
// Calculating Sum of Proper Divisors of num1 (220):

// The code initializes sum1 to 0.
// The for loop runs from 1 to 220/2 (i.e., 1 to 110):
// If 220 % fact == 0, it means fact is a proper divisor of 220.
// The divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110.
// Summing these divisors: 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284.
// Therefore, sum1 = 284.
// Calculating Sum of Proper Divisors of num2 (284):

// The code initializes sum2 to 0.
// The for loop runs from 1 to 284/2 (i.e., 1 to 142):
// If 284 % fact == 0, it means fact is a proper divisor of 284.
// The divisors of 284 are 1, 2, 4, 71, 142.
// Summing these divisors: 1 + 2 + 4 + 71 + 142 = 220.
// Therefore, sum2 = 220.
// Checking Amicable Condition:

// The code checks if sum1 == num2 and sum2 == num1:
// Here, sum1 = 284 and num2 = 284.
// Also, sum2 = 220 and num1 = 220.
// Since both conditions are true, the numbers 220 and 284 are amicable.
// The code prints "it is amicable".
// Summary:
// The code correctly checks if two input numbers are amicable by calculating the sum of their proper divisors and comparing these sums to the respective other number. If the sums match as described, the numbers are deemed amicable. In our example, 220 and 284 are amicable numbers.