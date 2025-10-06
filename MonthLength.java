import java.time.Month;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class MonthLength {
    public static void displayMonthLengths(Scanner scanner) {
        System.out.print("Enter a year (e.g., 2025): ");
        int year = scanner.nextInt();

        System.out.println("\nMonth lengths for the year " + year + ":");
        for (Month month : Month.values()) {
            YearMonth ym = YearMonth.of(year, month);
            int days = ym.lengthOfMonth();
            System.out.printf("%-10s : %d days%n",
                    month.getDisplayName(TextStyle.FULL, Locale.ENGLISH), days);
        }
    }
}
