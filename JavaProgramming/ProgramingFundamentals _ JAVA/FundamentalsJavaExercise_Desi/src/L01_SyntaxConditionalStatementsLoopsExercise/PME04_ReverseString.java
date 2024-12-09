package L01_SyntaxConditionalStatementsLoopsExercise;

import java.util.Scanner;

public class PME04_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String output = "";

        for (int position = input.length() -1; position >=0 ; position--) {
            char currentSymbol=input.charAt(position);
            output += currentSymbol;
        }

        System.out.printf("%s",output);

    }
}
