public class App {
    public static void main(String[] args) throws Exception {
        do {
            System.out.print("Enter a degree in Celsius: ");
            String in = System.console().readLine();
            double celsius = Double.parseDouble(in);
            double fahrenheit = (9.0 / 5.0) * celsius + 32;
            System.out.printf("%.05g Celsius is %.05g Fahrenheit\n", celsius, fahrenheit);
        } while (true);
    }
}
