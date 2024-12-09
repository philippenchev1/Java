package L02_DataTypes_Variables_Exercise;

import java.util.Scanner;

public class PME05_DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        String message = "";
        for (int i = 0; i < n; i++) {
            char currentChar = scanner.nextLine().charAt(0);
            message += (char) (currentChar + key);
        }

        System.out.println(message);

    }
}
