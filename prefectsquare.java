import java.util.Scanner;
public class prefectsquare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); {
        long n=sc.nextLong();
        long fact;
        long result=1;
        int count;
        for(fact=2; n!=1; fact++)
        {
            count=0;
        while(n%fact==0){
            
            count++;
            n=n/fact;
            
        }
        if(count%2==1)
        result=result*fact;   //2*3//1,2,3,6,12,24.

    }
    System.out.print(result);
        }}}
