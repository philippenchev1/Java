package L01_SyntaxConditionalStatementsLoopsExercise;

import java.util.Scanner;

public class P11_RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headset = countLostGames / 2;
        int mouseCount = countLostGames / 3;
        int keyboardCount = countLostGames / 6;
        int displayCount = countLostGames / 12;


        double finalPrice = (headsetPrice * headset) + (mousePrice * mouseCount) + (keyboardPrice * keyboardCount) + (displayPrice * displayCount);

        System.out.printf("Rage expenses: %.2f lv.",finalPrice);
    }
}
