import java.util.Scanner;
class nested{
    public static void main(String[] args) {
     int year;
     Scanner sc=new Scanner(System.in);
     year=sc.nextInt();
     if(year%4==0){
        if(year%100==0){
            if(year%400==0){
                System.out.println("Its a leap year");
            }
            else{
                System.out.println("not a leap year");
            }
        }
        else{
        System.out.println("its a leapyear");}
     }   
     else{
        System.out.println("its not leap year");
     }    
    }}

    //if(year%4==0 && year%100!=0 || year%400=0){
    //System.out.println("leap year");}
    //else{
      //  System.out.println("not a leap year");
    //}