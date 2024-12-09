package TestExams_15_16_June2019;

import java.util.Scanner;

public class P02_MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeForShooting = Integer.parseInt(scanner.nextLine());
        int numScenes = Integer.parseInt(scanner.nextLine());
        int timeOfScenes = Integer.parseInt(scanner.nextLine());

        double neededTime =numScenes * timeOfScenes +  (timeForShooting * 0.15);

        if (neededTime > timeForShooting){
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", Math.abs(timeForShooting-neededTime));
        }else {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!",timeForShooting-neededTime);
        }


    }
}
