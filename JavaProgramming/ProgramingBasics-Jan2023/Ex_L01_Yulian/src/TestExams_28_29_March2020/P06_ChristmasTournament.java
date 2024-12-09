package TestExams_28_29_March2020;

import java.util.Scanner;

public class P06_ChristmasTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalWonMoney = 0;
        int overallWinLoseRatio = 0;

        for (int i = 1; i <= days; i++) {
            String input = scanner.nextLine();
            int dailyWinLoseRatio = 0;
            double dailyWonMoney = 0;

            while (!input.equals("Finish")) {
                String winOrLose = scanner.nextLine();
                if (winOrLose.equals("win")) {
                    dailyWonMoney += 20;
                    dailyWinLoseRatio++;
                } else {
                    dailyWinLoseRatio--;
                }
                input = scanner.nextLine();
            }
            if (dailyWinLoseRatio > 0) {
                overallWinLoseRatio++;
                dailyWonMoney += dailyWonMoney * 0.1;
            } else {
                overallWinLoseRatio--;
            }
            totalWonMoney += dailyWonMoney;
        }
        if (overallWinLoseRatio > 0) {
            System.out.print("You won the tournament! ");
            totalWonMoney += totalWonMoney * 0.2;
        } else {
            System.out.print("You lost the tournament! ");
        }
        System.out.printf("Total raised money: %.2f", totalWonMoney);


    }
}
