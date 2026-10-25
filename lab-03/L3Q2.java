package Q2;

import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        Random generator = new Random();
        int number = generator.nextInt(6); // 0 to 5 inclusive

        String word = switch (number) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            default -> "five";
        };
        System.out.println(number + " is " + word + ".");
    }
}
