//50=10/10/10/10/10;
import java.util.Scanner;
public class pseudobinary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int digit;
        int cons=0;
        int pv=1;
       while(num!=0){
        while(num/pv!=0){
            digit=(num/pv)%10;
            if(digit>0)
            cons=1*pv+cons;
            else
            cons=0*pv+cons;
        pv=pv*10;
        }
        num=num - cons;
        if(num==0){
        System.out.print(cons);}
        else{
            System.out.print(cons + "+");
        }
}
    }
}
