package L04_Methods_Exercise;

import java.util.Scanner;

public class P03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char lastSymbol = scanner.nextLine().charAt(0);

        printCharactersInRange(firstSymbol, lastSymbol);
    }

    public static void printCharactersInRange(char firstSymbol, char lastSymbol) {
        if (firstSymbol < lastSymbol) {
            for (char symbol = (char) (firstSymbol + 1); symbol < lastSymbol; symbol++) {
                System.out.print(symbol + " ");
            }

        } else {
            for (char symbol = (char) (lastSymbol + 1); symbol < firstSymbol; symbol++) {
                System.out.print(symbol + " ");
            }
        }
    }
}
