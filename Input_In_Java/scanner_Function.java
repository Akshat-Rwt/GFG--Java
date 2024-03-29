package Input_In_Java;

import java.util.Scanner;

public class scanner_Function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a message: ");

        String message = scanner.nextLine();

        System.out.println("Your message is: " + message);

        scanner.close();
    }
}