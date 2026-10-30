import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int number = keyboard.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        System.out.print("The factors are: 1");
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(", " + i);
            }
        }
        System.out.println();
    }
}
