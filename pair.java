// import java.util.Scanner;
// class pair{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         int pair,cons=0,swap,pv=1;
//         while(num!=0){
//             pair=num%100;
//             swap=(pair%10)*10+(pair/10);
//             cons=swap*pv+cons;
//             pv=pv*100;
//             num=num/100;
//         }
//         System.out.print(cons);
//     }
// }


import java.util.Scanner;
class pair{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int pair,cons=0,swap,pv=1,nod=0,safe=1;
        while(num/pv!=0){
            nod++;
            pv*=10;
        }
        pv=1;
        if(nod%2!=0){
            safe=num%10;
            num=num%10;

        }
        while(num!=0){
            pair=num%100;
            swap=(pair%10)*10+(pair/10);
            cons=swap*pv+cons;
            pv=pv*100;
            num=num/100;
        }
        if(nod%2==1){
        cons=cons*10+safe;
        System.out.print(cons);}
        else{
            System.out.print(cons);
        }
    }
}