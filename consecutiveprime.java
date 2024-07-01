import java.util.*;
public class consecutiveprime {
    public static void main(String[] args) 
{
    int range,num,sum,count=0;
 Scanner sc = new Scanner(System.in);
 range = sc.nextInt();
 for(sum=2,num=3;num<=range&&sum<=range;num++)
 {
    if(isPrime(num)==1)
    {
        sum = sum +num;
        if(sum<=range && isPrime(sum)==1)
        {
            System.out.print(sum+" ");
            count++;
        }
    }
 }
 System.out.println(count);
}
 static int isPrime(int num)
 {
    int range,fact;
    if(num%2==0 && num!=2)
        return 0;
    if(num==2 || num==3)
        return 1;
    if(num%6!=5 && num%6!=1)
        return 0;
    range = (int)Math.sqrt(num);
    for(fact=3;fact<=range; fact+=2)
    if(num%fact==0){
        return 0;}
        return 1;
 }
}