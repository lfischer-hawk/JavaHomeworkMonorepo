import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the month");
        int month = scanner.nextInt();

        System.out.println("Input the year");
        int year = scanner.nextInt();

        System.out.printf("%s %d had %d days", App.MONTHS[month], year, daysInMonth(month, year));
        scanner.close();
    }
    // index into this array to get month names
    public static final String[] MONTHS = new String[] { "January", "February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December" };

    // check for leap year
    public static Boolean isLeapYear(int year) throws Exception {
        if (year < 1582) {
            throw new Exception("Pre-Gregorian date - I'm only reading so much Wikipedia for this");
        }
        return year % 4 == 0 && (!(year % 100 == 0) || year % 400 == 0);
    }
    
    public static int daysInMonth(int month, int year) throws Exception {
        return switch (month) {
            // Thirti dayes hath
            case 11, 4, 6, 9 -> 30;
            // Of xxviij is but oon
            case 2 -> {
                if (isLeapYear(year)) {
                    yield 29;
                } else {
                    yield 28;
                }
            }
            // And alle the remenaunt xxx and j
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            default -> throw new Exception("month outside of 1-12");
        };
    }
}