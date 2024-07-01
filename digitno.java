import java.util.*;
class digitno{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     long num,dig;
     num=sc.nextInt();
     while(num!=0){
        dig=num%10;
        System.out.printf("%d %d\n",num,dig);
      num=num/10;
     }

    }}