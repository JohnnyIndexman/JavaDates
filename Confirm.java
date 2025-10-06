import java.time.*;
import java.util.Scanner;

public class Confirm {
    public static void checkFriday13(Scanner scanner) {
        System.out.print("Enter year (e.g., 2025): ");
        int year = scanner.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();

        try {
            LocalDate date = LocalDate.of(year, month, day);
            boolean isFriday13 = date.getDayOfWeek() == DayOfWeek.FRIDAY && date.getDayOfMonth() == 13;
            if (isFriday13) {
                System.out.println(date + " is a Friday the 13th! 😱");
            } else {
                System.out.println(date + " is not a Friday the 13th.");
            }
        } catch (DateTimeException e) {
            System.out.println("Invalid date entered. Please try again.");
        }
    }
}

