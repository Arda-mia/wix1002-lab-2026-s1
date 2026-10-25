package L3Q5;
import java.util.Locale;
import java.util.Scanner;

public class L3Q5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = keyboard.nextDouble();
        double b = keyboard.nextDouble();
        double c = keyboard.nextDouble();
        double d = keyboard.nextDouble();
        double e = keyboard.nextDouble();
        double f = keyboard.nextDouble();

        double determinant = a * d - b * c;
        if (determinant == 0) {
            System.out.println("The equation has no solution");
        } else {
            double x = (e * d - b * f) / determinant;
            double y = (a * f - e * c) / determinant;
            System.out.printf(Locale.US, "x = %.2f, y = %.2f%n", x, y);
        }
    }
}
