public class App {
    public static void main(String[] args) throws Exception {
        do {
            System.out.print("Enter a degree in Celcius: ");
            String in = System.console().readLine();
            double celcius = Double.parseDouble(in);
            double fahrenheit = (9.0 / 5.0) * celcius + 32;
            System.out.printf("%.05g Celcius is %.05g Fahrenheit\n", celcius, fahrenheit);
        } while (true);
    }
}
