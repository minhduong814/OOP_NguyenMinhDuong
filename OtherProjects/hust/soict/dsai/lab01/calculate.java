import java.util.Scanner;
public class calculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = Double.parseDouble(input.nextLine());

        System.out.print("Enter the second number: ");
        double num2 = Double.parseDouble(input.nextLine());

        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        System.out.println("Quotient: " + ((num2 != 0) ? (num1 / num2) : "Cannot divide by zero."));

        System.exit(0);
    }
}