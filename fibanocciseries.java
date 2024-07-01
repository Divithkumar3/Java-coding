import java.util.Scanner;

public class fibanocciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("The number of terms must be a positive integer.");
        } else {
            System.out.print("Fibonacci series: ");
            int a = 0, b = 1;
            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
          
        }
    }
}

