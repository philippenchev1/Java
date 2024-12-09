package TestExams_18_19_July2020;

import java.util.Scanner;

public class P05_BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bestScore = 0;
        String bestPlayer = "";
        boolean hetTrick = false;
        boolean stop = false;

        String command = scanner.nextLine();
         while (!"END".equals(command)){
             String name = command;
             int goals = Integer.parseInt(scanner.nextLine());

             if (goals>bestScore){
                 bestScore = goals;
                 bestPlayer = name;
             }

             if (goals >= 3){
                 hetTrick = true;
             }

             if (goals>=10){
                 stop = true;
                 break;
             }



             command = scanner.nextLine();
         }

        if (stop){
            System.out.printf("%s is the best player!%n",bestPlayer);
            System.out.printf("He has scored %d goals and made a hat-trick !!!",bestScore);
        } else if (hetTrick) {
            System.out.printf("%s is the best player!%n",bestPlayer);
            System.out.printf("He has scored %d goals and made a hat-trick !!!",bestScore);
        } else {
            System.out.printf("%s is the best player!%n",bestPlayer);
            System.out.printf("He has scored %d goals.",bestScore);
        }


    }
}
