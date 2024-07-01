import java.util.Scanner;

public class date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the date input from the user
        System.out.print("Enter day (dd): ");
        int dd = sc.nextInt();
        System.out.print("Enter month (mm): ");
        int mm = sc.nextInt();
        System.out.print("Enter year (yyyy): ");
        int yyyy = sc.nextInt();

        // Initialize the number of days
        int days = dd; // Start with the given day

        // Add the number of days for the months before the given month
        for (int i = 1; i < mm; i++) {
            switch (i) {
                case 1:  // January
                case 3:  // March
                case 5:  // May
                case 7:  // July
                case 8:  // August
                case 10: // October
                case 12: // December
                    days += 31;
                    break;
                case 4:  // April
                case 6:  // June
                case 9:  // September
                case 11: // November
                    days += 30;
                    break;
                case 2:  // February
                    // Check for leap year
                    if ((yyyy % 4 == 0 && yyyy % 100 != 0) || (yyyy % 400 == 0)) {
                        days += 29;
                    } else {
                        days += 28;
                    }
                    break;
            }
        }

        // Output the result
        System.out.println("Number of days from the start of the year: " + days);
    }
}


