import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ten double values:\n");
        double[] nums = new double[10];
        int offset = 0;
        while(offset < 10) {
            nums[offset++] = scanner.nextDouble();
        }
        System.out.printf("average value: %f", average(nums));
        scanner.close();
    }
    public static int average(int[] array) {
        int acc = 0;
        for (int n : array) {
            acc += n;
        }
        return acc / array.length;
    }
    public static double average(double[] array) {
        double acc = 0;
        for (double n : array) {
            acc += n;
        }
        return acc / array.length;
    }
}
