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
/*
 * 7.15 (Eliminate duplicates) Write a method that returns a new array by eliminating the duplicate values in the array using the following method header:

public static int[] eliminateDuplicates(int[] list)

Write a test program that reads in ten integers, invokes the method, and displays the result. Here is the sample run of the program:

Enter ten numbers: 1 2 3 2 1 6 3 4 5 2
The distinct numbers are: 1 2 3 6 4 5
 */