import java.util.Scanner;
public class eveninrange {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); {
        int start=sc.nextInt();
        int end=sc.nextInt();
        int i;
        int sum=0;
        for(i=start;i<=end;i+=2){
            sum=sum+i;
        }
        System.out.println(sum);
       
        }}}