import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.printf("Tuition in 10 years: $%f\n", interest(10));
        double totalcost = IntStream.range(11, 14).mapToDouble(App::interest).sum();
        System.out.printf("Cost of tuition from year 11 to 14: $%.2f", totalcost);
    }
    public static double interest(int year) {
        return 10000*Math.pow(1.05, year);
    }
}
