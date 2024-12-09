package L01_SyntaxConditionalStatementsLoopsExercise;

import java.util.Scanner;

public class PME05_Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scanner.nextLine());
        String sumCurrentChar = " ";

        for (int i = 1; i <= numberOfLines; i++) {
            String input = scanner.nextLine();
            char[] inputCountArr = new char[input.length()];
            char currentChar = '0';

            if (input.contains("2")) {
                char[] content = {'a', 'b', 'c'};
                currentChar = calculateCurrentChar(inputCountArr, currentChar, content);
            } else if (input.contains("3")) {
                char[] content = {'D', 'e', 'f'};
                currentChar = calculateCurrentChar(inputCountArr, currentChar, content);
            } else if (input.contains("4")) {
                char[] content = {'g', 'h', 'i'};
                currentChar = calculateCurrentChar(inputCountArr, currentChar, content);
            } else if (input.contains("5")) {
                char[] content = {'j', 'k', 'l'};
                currentChar = calculateCurrentChar(inputCountArr, currentChar, content);
            } else if (input.contains("6")) {
                char[] content = {'M', 'n', 'o'};
                currentChar = calculateCurrentChar(inputCountArr, currentChar, content);
            } else if (input.contains("7")) {
                char[] content = {'p', 'q', 'r', 's'};
                currentChar = calculateCurrentChar(inputCountArr, currentChar, content);
            } else if (input.contains("8")) {
                char[] content = {'t', 'u', 'v'};
                currentChar = calculateCurrentChar(inputCountArr, currentChar, content);
            } else if (input.contains("9")) {
                char[] content = {'W', 'x', 'y', 'z'};
                currentChar = calculateCurrentChar(inputCountArr, currentChar, content);
            } else if (input.contains("0")) {
                currentChar = ' ';
            }

            sumCurrentChar = sumCurrentChar + currentChar;
        }

        System.out.println(sumCurrentChar.toLowerCase());
    }

    private static char calculateCurrentChar(char[] inputCountArr, char currentChar, char[] content) {
        if (inputCountArr.length == 1) {
            currentChar = content[0];
        } else if (inputCountArr.length == 2) {
            currentChar = content[1];
        } else if (inputCountArr.length == 3) {
            currentChar = content[2];
        } else if (inputCountArr.length == 4 && content.length == 4) {
            currentChar = content[3];
        } else if (inputCountArr.length >= content.length) {
            currentChar = content[inputCountArr.length % content.length];
        }

        return currentChar;
    }

}
