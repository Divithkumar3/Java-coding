import java.util.Scanner;
class swapping{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int pv1,pv2,dig1,dig2;
        int num=sc.nextInt();
        int pos1=sc.nextInt();
        int pos2=sc.nextInt();
     pv1=(int)Math.pow(10,pos1-1);
     pv2=(int)Math.pow(10,pos2-1);
     dig1=(num/pv1)%10;
     dig2=(num/pv2)%10;
     num=num-(dig1*pv1)-(dig2*pv2);
     num=num+(dig1*pv2)+(dig2*pv1);
     System.out.println(num);
    }
}

