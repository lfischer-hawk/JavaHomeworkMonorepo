import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double lbs = scanner.nextDouble();

        System.out.print("Enter feet for height: ");
        int feet = scanner.nextInt();

        System.out.print("Enter inches for height: ");
        int inches = scanner.nextInt();

        double bmi = lbs / Math.pow(feet*12 + inches, 2) * 703;

        System.out.printf("BMI is %f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 24.9) {
            System.out.println("Healthy Weight");
        } else if (bmi < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
        scanner.close();
    }
}
