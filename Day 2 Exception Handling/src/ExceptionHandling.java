import java.util.Scanner;


public class ExceptionHandling {
    public static void main(String[] args) {
        // try catch block
        int i = -1, j = -1;
        String str = null;

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter value of i : ");
            i = scanner.nextInt();

            j = 18 / i;
            if (j == 0)
                throw new ArithmeticException("i is less than 18, throws exception!");
            System.out.println("i : " + i);
            System.out.println("j : " + j);

            System.out.println(str.length());
            System.out.println(str);
        }
        catch (ArithmeticException e) {
            if (i == 0)
                System.out.println("Enter a positive number greater than 0");
            else if (i > 18) {
                j = 18 % i; // Default Solution
                System.out.println("Exception Handled Using Mod!");
            }
        }
        catch (NullPointerException e) {
            System.out.print("Enter a valid String : ");
            str = scanner.next();
            System.out.println("Length of String : "+ str.length());
        }
        catch (Exception e) {
            System.out.println("Something went wrong, try to understand -> " + e);
        }

    }
}
