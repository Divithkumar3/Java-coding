import java.util.Scanner;
class baseconversion{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rem;
        int conv=0;
        int pv=1;
        while(num!=0){
            rem=num%2;
        conv=rem*pv+conv;
        pv=pv*10;
        num=num/2;
        }
        System.out.print(conv);
    }
}
// 10100