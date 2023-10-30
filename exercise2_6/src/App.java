public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter the subtotal and gratuity rate: ");
        String in = System.console().readLine();
        String[] nums = in.split(" ");
        Double subtotal = Double.parseDouble(nums[0]);
        Double gratuity = Double.parseDouble(nums[1]) / 100;
        System.out.printf("\nThe gratuity is $%.2f and total is $%.2f", gratuity * subtotal, subtotal + gratuity * subtotal);
    }
}
