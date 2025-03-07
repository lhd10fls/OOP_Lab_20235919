import java.util.Scanner;

public class daysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String monthInput;
        int year;
        int days;

        while (true) {
            System.out.print("Enter the month: ");
            monthInput = scanner.nextLine().toLowerCase();
            
            System.out.print("Enter the year: ");
            year = scanner.nextInt();
            scanner.nextLine();  

            if (year < 0) {
                System.out.println("Invalid year input, please try again.");
                continue;
            }

            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            days = 0;

            switch (monthInput) {
                case "january":
                case "jan":
                case "1":
                    days = 31;
                    break;
                case "february":
                case "feb":
                case "2":
                    days = isLeapYear ? 29 : 28;
                    break;
                case "march":
                case "mar":
                case "3":
                    days = 31;
                    break;
                case "april":
                case "apr":
                case "4":
                    days = 30;
                    break;
                case "may":
                case "5":
                    days = 31;
                    break;
                case "june":
                case "6":
                    days = 30;
                    break;
                case "july":
                case "jul":
                case "7":
                    days = 31;
                    break;
                case "august":
                case "aug":
                case "8":
                    days = 31;
                    break;
                case "september":
                case "sep":
                case "9":
                    days = 30;
                    break;
                case "october":
                case "oct":
                case "10":
                    days = 31;
                    break;
                case "november":
                case "nov":
                case "11":
                    days = 30;
                    break;
                case "december":
                case "dec":
                case "12":
                    days = 31;
                    break;
                default:
                    System.out.println("Invalid month input, please try again.");
                    continue;
            }

            System.out.println("The number of days in " + monthInput + " " + year + " is: " + days);
            break;
        }
        scanner.close();
    }
}