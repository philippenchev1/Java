package L02_DataTypes_Variables_Exercise;

import java.util.Scanner;

public class PME06_BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte n = Byte.parseByte(scanner.nextLine());

        byte openingCount = 0;
        byte closingCount = 0;
        for (byte i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            if (input.equals("(")) {
                openingCount++;
            }
            else if (input.equals(")")) {
                closingCount++;
                if (openingCount - closingCount != 0) {
                    System.out.println("UNBALANCED");
                    return;
                }
            }
        }

        if (openingCount==closingCount) {
            System.out.println("BALANCED");
        }
        else {
            System.out.println("UNBALANCED");
        }


    }
}
