package Exams_18_19_February2023;

import java.util.Scanner;

public class P05_BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String input = scanner.nextLine();

        String topPlayer = "";
        int topScore = 0;
        boolean hatTrick = false;
        boolean stop = false;

        while (!input.equals("END")) {
            String player = input;
            int goals = Integer.parseInt(scanner.nextLine());

            if(goals>topScore){
                topScore = goals;
                topPlayer = player;
            }
            if (goals>=10){
                stop = true;
                break;
            }
            if (goals >= 3) {
                hatTrick = true;
            }
            input = scanner.nextLine();
        }
        if (stop) {
            System.out.printf("%s is the best player!%n", topPlayer);
            System.out.printf("He has scored %d goals and made a hat-trick !!!", topScore);
        } else if (!hatTrick){
            System.out.printf("%s is the best player!%n", topPlayer);
            System.out.printf("He has scored %d goals.", topScore);
        } else {
            System.out.printf("%s is the best player!%n", topPlayer);
            System.out.printf("He has scored %d goals and made a hat-trick !!!", topScore);
        }
    }
}


