import java.util.Scanner;
public class power {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        if((n&(n-1)) == 0 ){
            System.out.print("Yes it is power of 2");
    }
    else{
        System.out.println("not");
    }
        }}




