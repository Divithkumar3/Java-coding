import java.util.Scanner;
class strongnumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int safe;
        int sum=0;
        int digit;
        safe=num;
       
        while(num!=0){
            digit=num%10;
            int fact=1;
            for(int i=1;i<=digit;i++)
            {
                fact=fact*i;}
                sum=sum+fact;
                num=num/10;
            
        }
        num=safe;
        if(num==sum){
            System.out.print("Strong Number");
        }
        else{
            System.out.print("not");
        }
    }
}