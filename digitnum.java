import java.util.*;
class digitnum{
    public static void mian(String[] args){
     Scanner sc=new Scanner(System.in);
     long num,dig;
     num=sc.nextInt();
     while(num!=0){
        dig=num%10;
        System.out.println("%d%d"+num+dig);
      num=num/10;
     }

    }}