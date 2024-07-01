
import java.util.Scanner;
class evennum{
    public static void main(String[] args){
        long num,digit,pv=1;
        Scanner sc=new Scanner(System.in);
        num=sc.nextLong();
        while(num/pv!=0){
         pv=pv*10;}
         pv/=10;
         while (pv!=0) { 
             digit=(num/pv)%10;
         if(digit%2==0){
         System.out.printf("%d %d\n",num,digit);}
         pv/=10;
        }
        
    }
}