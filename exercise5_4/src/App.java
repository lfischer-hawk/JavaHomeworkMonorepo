public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Miles   Kilometers");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d       %6.3f\n", i, i*1.609);
        }
    }
}
