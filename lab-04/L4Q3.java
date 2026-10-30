import java.util.Scanner;

public class ScoreStatistics {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int count = 0, minimum = 0, maximum = 0;
        double sum = 0, sumOfSquares = 0;

        System.out.print("Enter a score [negative score to quit]:");
        int score = keyboard.nextInt();
        while (score >= 0) {
            if (count == 0 || score < minimum) {
                minimum = score;
            }
            if (count == 0 || score > maximum) {
                maximum = score;
            }
            count++;
            sum += score;
            sumOfSquares += (double) score * score;

            System.out.print("Enter a score [negative score to quit]:");
            score = keyboard.nextInt();
        }

        if (count == 0) {
            System.out.println("No scores entered.");
            return;
        }

        System.out.println("Minimum Score: " + minimum);
        System.out.println("Maximum Score: " + maximum);
        System.out.printf("Average Score: %.2f%n", sum / count);
        if (count > 1) {
            double variance = (sumOfSquares - sum * sum / count) / (count - 1);
            System.out.printf("Standard Deviation: %.2f%n", Math.sqrt(variance));
        } else {
            System.out.println("Standard Deviation: needs at least two scores");
        }
    }
}
