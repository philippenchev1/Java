package L03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class MEP02_BikeRace {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numJuniors = Integer.parseInt(scanner.nextLine());
        int numSeniors = Integer.parseInt(scanner.nextLine());
        String routeType = scanner.nextLine();

        double earnedMoney = 0;

        switch (routeType){
            case "trail":
                earnedMoney = numJuniors * 5.50 + numSeniors * 7;
                break;

            case "cross-country":
                earnedMoney = numJuniors * 8 + numSeniors * 9.50;
                if (numJuniors+numSeniors >= 50){
                    earnedMoney = numJuniors * (8*0.75)+ numSeniors * (9.5*0.75);
                }
                break;

            case "downhill":
                earnedMoney = numJuniors * 12.25 + numSeniors * 13.75;
                break;

            case "road":
                earnedMoney = numJuniors * 20 + numSeniors * 21.50;
                break;
        }

        double finalSum = earnedMoney * 0.95;

        System.out.printf("%.2f",finalSum);






    }
}
