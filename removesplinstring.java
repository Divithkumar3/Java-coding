import java.util.Scanner;
class removesplinstring{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int ind,res=0;
    String str=sc.nextLine();
    for(ind=0;ind<str.length();ind++){
        if(str.charAt(ind)>=0 && str.charAt(ind)<=9)
        res=res*10+(str.charAt(ind)-48);
    }        
    System.out.println(res);
    }}
