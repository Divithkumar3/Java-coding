import java.util.*;
class primemethod{
    public static void mian(String[] args){
     Scanner sc=new Scanner(System.in);
     long limit,num,fact,range;
     num=sc.nextLong();
     limit=sc.nextLong();
     for(num=2;num<=limit;num++){
        if(num%2==0 && num!=2)
        continue;
        else if(num%6==1 || num%6==5 || num==2 || num==3){
            range=(int)Math.sqrt(num);
            for(fact=3;fact<=range;fact+=2){
                if(num%fact==0)
                break;
            }
            if(fact>range)
            System.out.println(num+" ");

        } 
        
     }
    }
}

// import java.util.Scanner;
// class primemethod{
//     public static void main(String[] args){
//      Scanner sc=new Scanner(System.in);
//      int num1=sc.nextInt();
//      int num2=sc.nextInt();
//      for(int i=num1;i<=num2;i++){
//         for(int n=i;n<=i;n++){
            
//         }
//      }
//     }
// }
