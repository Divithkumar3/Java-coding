import java.util.Scanner;
class evenoddsegregation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int even=0,odd=0,digit,epv=1,opv=1;
        while(num!=0){
            digit=num%10;
            if(digit%2==0)
            {
                even=digit*epv+even;
                epv=epv*10;
            }
            else{
                odd=digit*opv+odd;
                opv*=10;
            }
            num=num/10;
        }
        int result=even*opv+odd;
        System.out.print(result);



    }}
