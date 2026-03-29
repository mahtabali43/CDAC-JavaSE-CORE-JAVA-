package inputmethods;

import java.io.Console;
import java.util.Arrays;

public class Input {
    public static void main(String[] args) {
        Console c = System.console();
        if (c == null) {
            System.out.println("No console available. Please run from a command line.");
            return;
        }

        System.out.println("Console:");
        String username = c.readLine("UserName: ");
        char[] password = c.readPassword("Password: ");

        System.out.println("Password length of " + username + " is " + password.length);
        System.out.print("Password characters: ");
        for (char ch : password) {
            System.out.print(ch);
        }
        System.out.println();

        // Clear password for security (optional)
        Arrays.fill(password, ' ');
    }
}