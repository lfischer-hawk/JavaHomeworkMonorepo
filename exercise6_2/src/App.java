public class App {
    public static void main(String[] args) throws Exception {
        System.out.printf("sum of 234 is: %d\n", sumDigits(234));
        System.out.printf("sum of 1390 is: %d\n", sumDigits(1390));
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
