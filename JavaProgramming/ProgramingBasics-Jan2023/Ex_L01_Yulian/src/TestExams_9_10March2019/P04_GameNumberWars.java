package TestExams_9_10March2019;

import java.util.Scanner;

public class P04_GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstPlayerName = scanner.nextLine();
        String secondPlayerName = scanner.nextLine();
        String command = scanner.nextLine();

        int countPointsFirstPlayer = 0;
        int countPointsSecondPlayer = 0;

        while (!command.equals("End of game")){
            int firstPlayerCard = Integer.parseInt(command);
            int secondPlayerCard = Integer.parseInt(scanner.nextLine());

            if (firstPlayerCard > secondPlayerCard){
                countPointsFirstPlayer += firstPlayerCard - secondPlayerCard;
            } else if (firstPlayerCard < secondPlayerCard) {
                countPointsSecondPlayer += secondPlayerCard - firstPlayerCard;
            }else {
                System.out.printf("Number wars!%n");
                int firstPlayerCardRound2 = Integer.parseInt(scanner.nextLine());
                int secondPlayerCardRound2 = Integer.parseInt(scanner.nextLine());

                if (firstPlayerCardRound2 > secondPlayerCardRound2){
                    System.out.printf("%s is winner with %d points",firstPlayerName,countPointsFirstPlayer);
                    return;
                }else {
                    System.out.printf("%s is winner with %d points",secondPlayerName,countPointsSecondPlayer);
                    return;

                }
            }


            command = scanner.nextLine();
        }
        System.out.printf("%s has %d points%n",firstPlayerName,countPointsFirstPlayer);
        System.out.printf("%s has %d points",secondPlayerName,countPointsSecondPlayer);


    }
}
