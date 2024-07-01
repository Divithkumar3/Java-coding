import java.util.*;
class arraysmallest
{
  static int smallest_ele(int arr[], int size)
  {
    int ind,min=Integer.MAX_VALUE;
    for(ind=0; ind<size; ind++)
    {
      if(arr[ind] < min)
        min = arr[ind];
    }
    return min;
  }
  public static void main(String[] args)
  {
    int ind,size;
    Scanner sc = new Scanner(System.in);
    size = sc.nextInt();
    int[] arr = new int[size];
    for(ind=0; ind<size; ind++)
      arr[ind]=sc.nextInt();
    System.out.printf("%d",smallest_ele(arr,size));
  }
}