// import java.util.Scanner;
// public class betrothed 
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in); {
//             long num1,num2,fact,sum1=0,sum2=0;
//             num1=sc.nextInt();
//             num2=sc.nextInt();
//             for(fact=1;fact<=num1/2;fact++){
//                 if(num1%fact==0)
//                 sum1=sum1+fact;
//             }
//             for(fact=1;fact<=num2/2;fact++){
//                 if(num2%fact==0)
//                 sum2=sum2+fact;
//             }
//             if(sum1==num2 && sum2==num1){
//                 System.out.print(" it is amicable");
//             }
//             else{
//                 System.out.println("it is not amicable");
//             }
        
    
//         }}}

//Betrothed Pair
import java.util.*;
public class betrothed {
    public static void main(String args[]) 
    {
        long num1,num2,fact,sum1=0,sum2=0;
        Scanner input = new Scanner(System.in);
        num1 = input.nextLong();
        num2 = input.nextLong();
        for(fact=1; fact<=num1/2;fact++)
        {
            if(num1%fact==0)
                sum1=sum1+fact;
        }
        for(fact=1; fact<=num2/2;fact++)
        {
            if(num2%fact==0)
                sum2=sum2+fact;
        }
        if(sum1==num2+1 && sum2==num1+1)
        System.out.println("Betrothed Pair");
        else
        System.out.println("Not");
    }
}
