//  import java.util.Scanner;
//  class append{
//      public static void main(String[] args) {
//          Scanner sc=new Scanner(System.in);
//      int num,result=0; 
//  while(true)
//  {
//      num=sc.nextInt();
//      if((num)==-1)
//      break;
//      result = result*10 + num;
//      System.out.printf("%d %d\n",num,result);
//      }}}

 import java.util.Scanner;
 class Append {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int num, result = 0;
         int count = 0;
         while (count < 5) {
             num = sc.nextInt();
             result = result * 10 + num;
             System.out.printf("%d %d\n", num, result);
             count++;
         }
     }
 }
//Left Append
// import java.util.*;
// public class append {
//     public static void main(String args[]) 
//     {
//         long num,res=0,pv=1;
//         Scanner input = new Scanner(System.in);
//         while(true)
//         {
//             num = input.nextInt();
//             if(num==-1)
//             break;
//             res = num * pv + res;
//             pv=pv*10;
//             System.out.printf("%d %d\n",num,res);
//         }
//     }
// } 
