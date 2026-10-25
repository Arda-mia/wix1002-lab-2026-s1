package L3Q1;

public class L3Q1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter two integer number: ");
        int first = keyboard.nextInt();
        int second = keyboard.nextInt();
        System.out.print("Enter the operand: ");
        char operator = keyboard.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(first + " + " + second + " = " + (first + second));
                break;
            case '-':
                System.out.println(first + " - " + second + " = " + (first - second));
                break;
            case '*':
                System.out.println(first + " * " + second + " = " + (first * second));
                break;
            case '/':
                if (second == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println(first + " / " + second + " = " + (first / second));
                }
                break;
            case '%':
                if (second == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println(first + " % " + second + " = " + (first % second));
                }
                break;
            default:
                System.out.println("Invalid operator: " + operator);
        }
    }
}
