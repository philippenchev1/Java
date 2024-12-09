package TestExams_9_10March2019;

import java.util.Scanner;

public class P02_FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String third = scanner.nextLine();

        int countWin = 0;
        int countLost = 0;
        int countDraw = 0;

        char firstGameHost = first.charAt(0);
        char firstGameGuest = first.charAt(2);
        if (firstGameGuest > firstGameHost){
            countLost++;
        } else if (firstGameHost > firstGameGuest) {
            countWin++;

        }else {
            countDraw++;
        }

        char secondGameHost = second.charAt(0);
        char secondGameGuest = second.charAt(2);
        if (secondGameGuest > secondGameHost){
            countLost++;
        } else if (secondGameHost > secondGameGuest) {
            countWin++;

        }else {
            countDraw++;
        }

        char thirdGameHost = third.charAt(0);
        char thirdGameGuest = third.charAt(2);
        if (thirdGameGuest > thirdGameHost){
            countLost++;
        } else if (thirdGameHost > thirdGameGuest) {
            countWin++;

        }else {
            countDraw++;
        }

        System.out.printf("Team won %d games.%n",countWin);
        System.out.printf("Team lost %d games.%n",countLost);
        System.out.printf("Drawn games: %d",countDraw);



    }
}
