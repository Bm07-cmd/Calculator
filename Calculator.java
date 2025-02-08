/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.println("\nChoose an operation:");
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.println("5. Exit");

			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			if(choice == 5) {
				System.out.println("Exiting the calculator.");
				break;
			}
			System.out.print("Enter the first number: ");
			double num1 = scanner.nextDouble();

			System.out.print("Enter the second number: ");
			double num2 = scanner.nextDouble();

			double result = 0;

			if(choice == 1) {
				result = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + result);
				break;
			}
			else if(choice == 2) {
				result = num1 - num2;
				System.out.println(num1 + " - " + num2 + " = " + result);
				break;
			}
			else if(choice == 3) {
				result = num1 * num2;
				System.out.println(num1 + " * " + num2 + " = " + result);
				break;
			}
			else if(choice == 4) {
				if (num2 == 0) {
					System.out.println("Error: Cannot divide by zero.");
				} else {
					result = num1 / num2;
					System.out.println(num1 + " / " + num2 + " = " + result);
				}
				break;
			}
			else {
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}


