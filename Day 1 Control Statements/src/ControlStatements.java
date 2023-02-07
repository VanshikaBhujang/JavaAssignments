import java.util.Scanner;

public class ControlStatements {
    // Control Statements Implementation
    public static void main(String[] args) {

        // 1. BREAK using SWITCH case
        System.out.print("Enter a number (between 0-6) : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextByte();

        switch (n) {
            case 0:
                System.out.println("Its Sunday!");
                break;
            case 1:
                System.out.println("Its Monday!");
                break;
            case 2:
                System.out.println("Its Tuesday!");
                break;
            case 3:
                System.out.println("Its Wednesday!");
                break;
            case 4:
                System.out.println("Its Thursday!");
                break;
            case 5:
                System.out.println("Its Friday!");
                break;
            case 6:
                System.out.println("Its Saturday!");
                break;
            default:
                System.out.println("Enter a valid number.");

                // 2. using CONTINUE to print only even numbers till num.
                System.out.print("Enter a number : ");
                int num = scanner.nextByte();

                int i = 0;
                while (i < num) {
                    if (i % 2 != 0)
                        continue;

                    System.out.println(i);
                    i++;
                }
        }
    }
}