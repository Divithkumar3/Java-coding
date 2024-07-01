// import java.util.Scanner;
// class perfectcube{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         int flag=0;
//         int i;
//         for(i=1;i<=num;i++){
//             if(num ==(i*i*i)){
//                 System.out.print("Perfect cube");
//             }
//         }
//     }
// }

import java.util.Scanner;
class perfectcube{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int flag=0;
        int i;
        for(i=1;i<=num;i++){
            if(num ==(i*i)){
                System.out.print("Perfect square");
            }
        }
    }
}