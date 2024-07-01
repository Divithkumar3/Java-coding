//else if
import java.util.Scanner;
public class elseif {
    public static void main(String[] args){
        int num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("FooBar");
        }
        else if(num%3==0){
        System.out.println("Foo");
        }
        else if(num%5==0){
        System.out.println("Bar");
        }
       
    }
}
//cascade if
// import java.util.Scanner;
// public class elseif {
//     public static void main(String[] args){
//         int num;
//         Scanner sc=new Scanner(System.in);
//         num=sc.nextInt();
//         if(num%3==0 && num%5==0){
//             System.out.println("FooBar");
//         }
//         if(num%3==0){
//         System.out.println("Foo");
//         }
//         if(num%5==0){
//         System.out.println("Bar");
//         }
       
//     }
// }
