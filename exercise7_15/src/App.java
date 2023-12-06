import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ten integer values:\n");
        int[] nums = new int[10];
        int offset = 0;
        while(offset < 10) {
            nums[offset++] = scanner.nextInt();
        }
        int[] deduplicated = eliminateDuplicates(nums);
        System.out.println("The distinct numbers are:");
        for (int i : deduplicated) {
            System.out.printf("%d ", i);
        }
        scanner.close();
    }
    public static int[] eliminateDuplicates(int[] list) {
        boolean[] dupemask = new boolean[list.length];
        for (int i = 0; i < list.length-1; i++) {
            for (int j = i+1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    dupemask[i] = true;
                }
            }
        }
        int uniquecount = 0;
        for (boolean b : dupemask) {
            if (!b) uniquecount++;
        }
        int[] output = new int[uniquecount];
        int outcursor = 0;
        for (int i = 0; i < dupemask.length; i++) {
            if (!dupemask[i]) {
                output[outcursor++] = list[i];
            }
        }
        return output;
    }
}