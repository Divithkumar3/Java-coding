import java.util.Scanner;
public class factor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); {
            long n,fact;
            n=sc.nextInt();
            for(fact=1;fact<=n;fact++){
                if(n%fact==0){
                System.out.println(fact);
                }
            }

    
        }}}