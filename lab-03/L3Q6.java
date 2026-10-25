package L3Q6;
import java.util.Locale;
import java.util.Scanner;

public class L3Q6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter the radius of the circle: ");
        double radius = keyboard.nextDouble();
        System.out.print("Enter a point (x y): ");
        double x = keyboard.nextDouble();
        double y = keyboard.nextDouble();

        double distance = Math.sqrt(x * x + y * y);
        if (distance <= radius) {
            System.out.printf(Locale.US, "Point (%.2f, %.2f) is inside the circle%n", x, y);
        } else {
            System.out.printf(Locale.US, "Point (%.2f, %.2f) is outside the circle%n", x, y);
        }
    }
}
