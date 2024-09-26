package Menudriven;

import java.util.Scanner;

public class MenuDrivenExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String choice;

		do {

			System.out.println("Menu:");
			System.out.println("ADD. Add two numbers");
			System.out.println("SUB. Subtract two numbers");
			System.out.println("MUL. Multiply two numbers");
			System.out.println("DIV. Divide two numbers");
			System.out.println("END. Invalid Choice");

			System.out.println("Enter your choice: ");
			choice = sc.next();

			switch (choice) {
			case "Add":

				System.out.println("Enter First Value");
				int num1 = sc.nextInt();
				System.out.println("Enter second value");
				int num2 = sc.nextInt();
				int sum = num1 + num2;
				System.out.println("Addition : " + sum);
				break;
			case "Sub":
				System.out.println("Enter First Value");
				int num3 = sc.nextInt();
				System.out.println("Enter second value");
				int num4 = sc.nextInt();
				int sub = num3 - num4;
				System.out.println("Subtraction : " + sub);
				break;
			case "Mul":
				System.out.println("Enter First Value");
				int num5 = sc.nextInt();
				System.out.println("Enter second value");
				int num6 = sc.nextInt();
				int mul = num5 * num6;
				System.out.println("Multiplication : " + mul);
				break;
			case "Div":
				System.out.println("Enter First Value");
				int num7 = sc.nextInt();
				System.out.println("Enter second value");
				int num8 = sc.nextInt();
				int div = num7 / num8;
				System.out.println("Division : " + div);;
				break;
			
			default:
				System.out.println("Invalid choice EXIT.........");
				System.exit(0);
			}

		} while (choice != "End");

		sc.close();
	}

}
