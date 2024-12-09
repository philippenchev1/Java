package TestExams_9_10March2019;

import java.util.Scanner;

public class P03_Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String appliance = scanner.nextLine();

        double difficultyPoints = 0;
        double performancePoints = 0;

        switch (country){
            case "Russia":
                switch (appliance){
                    case "ribbon":
                        difficultyPoints = 9.1;
                        performancePoints = 9.4;
                        break;
                    case "hoop":
                        difficultyPoints = 9.3;
                        performancePoints = 9.8;
                        break;
                    case "rope":
                        difficultyPoints = 9.6;
                        performancePoints = 9.0;
                        break;
                }
                break;

            case "Bulgaria":
                switch (appliance){
                    case "ribbon":
                        difficultyPoints = 9.6;
                        performancePoints = 9.4;
                        break;
                    case "hoop":
                        difficultyPoints = 9.55;
                        performancePoints = 9.75;
                        break;
                    case "rope":
                        difficultyPoints = 9.5;
                        performancePoints = 9.4;
                        break;
                }
                break;

            case "Italy":
                switch (appliance){
                    case "ribbon":
                        difficultyPoints = 9.2;
                        performancePoints = 9.5;
                        break;
                    case "hoop":
                        difficultyPoints = 9.45;
                        performancePoints = 9.35;
                        break;
                    case "rope":
                        difficultyPoints = 9.7;
                        performancePoints = 9.15;
                        break;
                }
                break;
        }

        double sumPoints = difficultyPoints + performancePoints;
        double percentToWinMaxPoints = (20 - sumPoints)/20 *100;

        System.out.printf("The team of %s get %.3f on %s.%n",country,sumPoints,appliance);
        System.out.printf("%.2f%%",percentToWinMaxPoints);

    }
}
