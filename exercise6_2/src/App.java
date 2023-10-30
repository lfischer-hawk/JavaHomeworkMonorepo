public class App {
    public static void main(String[] args) throws Exception {
        System.out.printf("%d", sumDigits(234));
    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
