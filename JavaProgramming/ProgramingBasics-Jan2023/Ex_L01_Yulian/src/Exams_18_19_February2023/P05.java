package Exams_18_19_February2023;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int bestScore = 0;
        String topPlayer = "";
        boolean stop = false;
        boolean hatTrick = false;

        while (!command.equals("END")) {
            String name = command;
            int countGoals = Integer.parseInt(scanner.nextLine());


            if (countGoals > bestScore) {
                bestScore = countGoals;
                topPlayer = name;
            }


            if (countGoals >= 10) {
                stop = true;
                break;
            }

            if (countGoals >= 3) {
                hatTrick = true;

            }

            command = scanner.nextLine();
        }

        if (stop){
            System.out.printf("%s is the best player!%n",topPlayer);
            System.out.printf("He has scored %d goals and made a hat-trick !!!",bestScore);
        } else if (!hatTrick) {
            System.out.printf("%s is the best player!%n",topPlayer);
            System.out.printf("He has scored %d goals.",bestScore);
        }else {
            System.out.printf("%s is the best player!%n",topPlayer);
            System.out.printf("He has scored %d goals.",bestScore);
        }


    }
}
