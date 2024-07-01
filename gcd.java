import java.util.Scanner;
class gcd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int hcf=0;
        int min=(num1<num2)?num1:num2;
        for( int i=1;i<=min;i++){
             if(num1%i==0 && num2%i==0){
                hcf=i;
             }
        }
        System.out.print(hcf);
    }
}
//euclid's method
//while(num2!=0){
//rem=num1%num2;
//num1=num2;
//num2=rem;}
//print(num1);