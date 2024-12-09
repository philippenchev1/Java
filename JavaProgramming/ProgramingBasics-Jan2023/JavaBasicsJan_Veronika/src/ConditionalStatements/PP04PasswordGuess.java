package ConditionalStatements;

import java.util.Scanner;

public class PP04PasswordGuess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (password.equals("s3cr3t!P@ssw0rd")) {
            System.out.printf("Welcome");
        }else {
            System.out.printf("Wrong password!");
        }
    }
}
