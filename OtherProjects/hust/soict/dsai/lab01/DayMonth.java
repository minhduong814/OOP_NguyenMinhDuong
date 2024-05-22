import java.util.Scanner;
public class DayMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int monthIndex = -1, year = -1;
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};      

        //input the month
        do {
            System.out.print("Enter the month: ");
            String monthInput = input.nextLine();
            for (int i = 0; i < 12; i++) {
                if (monthInput.equals(monthNames[i]) ||
                        monthInput.equals(monthNames[i].substring(0, 3)) ||
                        monthInput.equals(monthNames[i].substring(0, 3) + ".") ||
                        monthInput.equals(String.valueOf(i + 1))) {
                    monthIndex = i;
                    break;
                }
            }
            if (monthIndex == -1) {
                System.out.println("Invalid month. Please enter again.");
            }
        } while (monthIndex == -1);
        //input the year
        do {
            System.out.print("Enter the year: ");
            while (!input.hasNextInt()) {
                System.out.println("Invalid year. Please enter again.");
                input.next();
            }
            year = input.nextInt();
            if (year < 0) {
                System.out.println("Invalid year. Please enter again.");
            }
        } while (year < 0);

        int days = daysInMonth[monthIndex];
        if ((monthIndex == 1) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)))
            days += 1;
        System.out.println("Number of days in " + monthNames[monthIndex] + " " + year + ": " + days);
    }

}