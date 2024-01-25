import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0, num2 = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.println("Enter the first number: ");
            try {
                num1 = scanner.nextDouble();
                isValidInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid number.");
                scanner.next(); // discard the invalid input
            }
        }

        isValidInput = false;
        while (!isValidInput) {
            System.out.println("Enter the second number: ");
            try {
                num2 = scanner.nextDouble();
                isValidInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid number.");
                scanner.next(); // discard the invalid input
            }
        }

        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();

        double output;

        switch (operator) {
            case '+':
                output = num1 + num2;
                break;
            case '-':
                output = num1 - num2;
                break;
            case '*':
                output = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;
                }
                output = num1 / num2;
                break;
            default:
                System.out.println("Error! Invalid operator. Please use +, -, *, or /.");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + output);
    }
}