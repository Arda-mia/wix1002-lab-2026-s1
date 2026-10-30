import java.util.Scanner;

public class MortgageTable {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = keyboard.nextDouble();
        System.out.print("Enter interest in %: ");
        double yearlyRate = keyboard.nextDouble();
        System.out.print("Enter total number of month(s): ");
        int months = keyboard.nextInt();

        if (principal <= 0 || yearlyRate <= 0 || months <= 0) {
            System.out.println("Principal, interest and months must be positive.");
            return;
        }

        double r = yearlyRate / (12 * 100);                               // monthly rate
        double payment = principal * r / (1 - Math.pow(1 + r, -months));  // M
        double totalInterest = 0;

        System.out.printf("%-6s%18s%14s%12s%18s%18s%n", "Month", "Monthly Payment",
                "Principal", "Interest", "Unpaid Balance", "Total Interest");
        for (int n = 1; n <= months; n++) {
            double principalDue = payment * Math.pow(1 + r, -(1 + months - n));  // Cn
            double interestDue = payment - principalDue;                          // Ln
            double balance = interestDue / r - principalDue;                      // Rn
            totalInterest += interestDue;
            System.out.printf("%-6d%18.2f%14.2f%12.2f%18.2f%18.2f%n", n, payment,
                    principalDue, interestDue, Math.abs(balance), totalInterest);
        }
    }
}
