import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.out.printf("The sum of %d and %d is %d%n",a,b,c);


    }
}