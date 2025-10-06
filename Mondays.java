import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Mondays{
    public static void listMondays(Scanner scanner) {
        int currentYear = Year.now().getValue();
        System.out.print("Enter month number (1-12): ");
        int month = scanner.nextInt();

        YearMonth ym = YearMonth.of(currentYear, month);
        System.out.println("\nMondays in " + ym.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH)
                + " " + currentYear + ":");

        for (int day = 1; day <= ym.lengthOfMonth(); day++) {
            LocalDate date = ym.atDay(day);
            if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
                System.out.println(date);
            }
        }
    }
}

