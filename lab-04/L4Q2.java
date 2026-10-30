import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = keyboard.nextInt();

        long term = 0;    // 1 + 2 + ... + i
        long total = 0;   // sum of all the terms
        for (int i = 1; i <= n; i++) {
            term += i;
            total += term;
        }
        System.out.println("Sum = " + total);
    }
}
