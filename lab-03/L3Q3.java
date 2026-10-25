package L3Q1;
import java.util.Locale;
import java.util.Scanner;

public class L3Q1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter the sales volume: ");
        double sales = keyboard.nextDouble();

        if (sales < 0) {
            System.out.println("Sales volume cannot be negative");
            return;
        }

        double rate;
        if (sales <= 100) {
            rate = 0.05;
        } else if (sales <= 500) {
            rate = 0.075;
        } else if (sales <= 1000) {
            rate = 0.10;
        } else {
            rate = 0.125;
        }
        double commission = sales * rate;
        System.out.printf(Locale.US, "Commission: %.2f%n", commission);
    }
}
