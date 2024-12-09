package L02_DataTypes_Variables_Exercise;

import java.util.Scanner;

public class P04_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberLines = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= numberLines ; i++) {
            char currentSymbol = scanner.nextLine().charAt(0);
            int asciiCode = (int) currentSymbol;
            sum += asciiCode;

        }

        System.out.printf("The sum equals: %d",sum);

    }
}
