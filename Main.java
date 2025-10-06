import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== DATE UTILITIES MENU ===");
            System.out.println("1. Display the length of each month in a given year");
            System.out.println("2. List all Mondays in a given month of the current year");
            System.out.println("3. Test if a date is Friday the 13th");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    MonthLength.displayMonthLengths(scanner);
                    break;
                case 2:
                    Mondays.listMondays(scanner);
                    break;
                case 3:
                    Confirm.checkFriday13(scanner);
                    break;
                case 4:
                    System.out.println("Exiting program... Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
