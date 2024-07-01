import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); {
        int n=sc.nextInt();
        long factorial=1;  //long-8 to 64 bytes,//int-4bytes.
        for(int i=1;i<=n;i++){
            factorial=factorial* i;
        }
        System.out.println(factorial);
            
    }}}