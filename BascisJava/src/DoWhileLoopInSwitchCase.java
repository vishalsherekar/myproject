
import java.util.Scanner;

public class DoWhileLoopInSwitchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You chose 1");
                    break;
                case 2:
                    System.out.println("You chose 2");
                    break;
                case 3:
                    System.out.println("You chose 3");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        scanner.close();
    }
}
