package TestExams_18_19_July2020;

import java.util.Scanner;

public class P04_Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balls = Integer.parseInt(scanner.nextLine());
        int totalPoints = 0;
        int countRed = 0;
        int countOrange = 0;
        int countYellow = 0;
        int countWhite = 0;
        int countOther = 0;
        int countBlack = 0;

        for (int i = 1; i <= balls ; i++) {
            String color = scanner.nextLine();

            switch (color){
                case "red":
                    totalPoints += 5;
                    countRed++;
                    break;
                case "orange":
                    totalPoints += 10;
                    countOrange++;
                    break;
                case "yellow":
                    totalPoints += 15;
                    countYellow++;
                    break;
                case "white":
                    totalPoints += 20;
                    countWhite++;
                    break;
                case "black":
                    totalPoints = totalPoints / 2;
                    countBlack++;
                    break;
                default:
                    countOther++;
                    break;
            }

        }
        System.out.printf("Total points: %d%n",totalPoints);
        System.out.printf("Red balls: %d%n",countRed);
        System.out.printf("Orange balls: %d%n",countOrange);
        System.out.printf("Yellow balls: %d%n",countYellow);
        System.out.printf("White balls: %d%n",countWhite);
        System.out.printf("Other colors picked: %d%n",countOther);
        System.out.printf("Divides from black balls: %d%n",countBlack);


    }
}
