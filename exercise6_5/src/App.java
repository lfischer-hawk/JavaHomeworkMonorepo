import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        displaySortedNumbers(num1, num2, num3);
        scanner.close();
    }
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        if (num1 > num2) {
            double tmp = num2;
            num2 = num1;
            num1 = tmp;
        }
        if (num2 > num3) {
            double tmp = num3;
            num3 = num2;
            num2 = tmp;
        }
        if (num1 > num2) {
            double tmp = num2;
            num2 = num1;
            num1 = tmp;
        }
        System.out.printf("%f %f %f", num1, num2, num3);
    }
}
