import java.util.Scanner;
public class title{
    public static void main(String[] args){
        float num;
        int width,prec;
        Scanner sc = new Scanner(System.in);
        num=sc.nextFloat();
        width=sc.nextInt();
        prec=sc.nextInt();
        System.out.printf("%"+width+"."+prec+"f",num);
    }
}