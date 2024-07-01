import java.util.Scanner;
class insertposition{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int arr[]=new int[num+1];
    int i;
    for(i=0;i<num;i++){
      arr[i]=sc.nextInt();
    }
    int ele=sc.nextInt();
    int pos=sc.nextInt();
    for(i=num;i>=pos;i--){
      arr[i]=arr[i-1];
    }
    arr[pos-1]=ele;
    for(i=0;i<=num;i++){
      System.out.print(arr[i]+" ");
    }
  }
}