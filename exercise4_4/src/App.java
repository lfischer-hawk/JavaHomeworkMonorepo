import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length: ");
        double side = scanner.nextDouble();

        double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6.0));

        System.out.printf("The area of the hexagon is %f", area);
        scanner.close();
    }
}
