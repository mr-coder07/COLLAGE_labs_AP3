import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();

        // Print multiplication table
        for (int i = 0; i <= 10; i++) {
            System.out.println(intValue + " * " + i + " = " + (intValue * i));
        }

        scanner.close(); 
    }
}
