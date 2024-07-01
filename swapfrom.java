import java.util.Scanner;
class swapfrom{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num,pos,pv,last,dig,res=0;
        num=sc.nextInt();
        pos=sc.nextInt();
        pv=(int)Math.pow(10,pos);
        last=num%pv;
        while(last!=0){
            dig=last%10;
            res=res*10+dig;
            last=last/10;
        }
        num=(num/pv)*pv+res;
        System.out.println(num);    }
}
