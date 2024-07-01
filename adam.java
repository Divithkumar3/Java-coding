import java.util.Scanner;
class adam{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       int square1,reverse1=0,square2,reverse2=0,digit;
       int num=sc.nextInt();
       square1=num*num;
       while(num!=0){
        digit=num%10;
        reverse1=reverse1*10+digit;
        num/=10;
       }
       square2=reverse1*reverse1;
       while(square2!=0){
        digit=square2%10;
        reverse2=reverse2*10+digit;
        square2=square2/10;
       }
       if(square1==reverse2){
        System.out.print("adam number");
       }
       else{
        System.out.print("not a adam number");
       }
    }
}

// Detailed Explanation with Example Input 12
// Input and Initial Calculations:

// The user inputs the number 12.
// The code calculates square1 as 
// 1
// 2
// 2
// =
// 144
// 12 
// 2
//  =144.
// Reversing the Original Number:

// num is 12.
// The while loop runs:
// Extracts the last digit 2 from 12.
// Updates reverse1 to 2.
// Updates num to 1.
// Extracts the last digit 1 from 1.
// Updates reverse1 to 21.
// Updates num to 0 (loop ends).
// The reversed number (reverse1) is 21.
// Calculating the Square of the Reversed Number:

// The code calculates square2 as 
// 2
// 1
// 2
// =
// 441
// 21 
// 2
//  =441.
// Reversing the Square of the Reversed Number:

// square2 is 441.
// The while loop runs:
// Extracts the last digit 1 from 441.
// Updates reverse2 to 1.
// Updates square2 to 44.
// Extracts the last digit 4 from 44.
// Updates reverse2 to 14.
// Updates square2 to 4.
// Extracts the last digit 4 from 4.
// Updates reverse2 to 144.
// Updates square2 to 0 (loop ends).
// The reversed square (reverse2) is 144.
// Comparison and Result:

// The code compares square1 (which is 144) with reverse2 (which is 144).
// Since they are equal, the code prints "adam number".
// Therefore, the number 12 is indeed an Adam number, as verified by the code.