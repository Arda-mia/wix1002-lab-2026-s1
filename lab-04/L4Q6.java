import java.util.Random;

public class DigitCount {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(Integer.MAX_VALUE);   // 0 to 2147483646

        int digits = 0;
        int remaining = number;
        do {                       // do-while: 0 still has one digit
            digits++;
            remaining /= 10;
        } while (remaining != 0);

        System.out.println("Number: " + number);
        System.out.println("Number of digits: " + digits);
    }
}
