package L03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class MEP01_MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int numOfPeople = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double transport = 0;

        switch (category){
            case "VIP":
                price = 499.99 * numOfPeople;
                if (numOfPeople >=1 && numOfPeople <=4){
                    transport = budget * 0.75;

            } else if (numOfPeople <= 9) {
                    transport = budget * 0.6;

            } else if (numOfPeople <= 24) {
                    transport = budget * 0.5;

            } else if (numOfPeople <=49) {
                    transport = budget * 0.4;

            }else {
                    transport = budget * 0.25;
                }

                break;
            case "Normal":
                price = 249.99 * numOfPeople;
                if (numOfPeople >=1 && numOfPeople <=4){
                    transport = budget * 0.75;

                } else if (numOfPeople <= 9) {
                    transport = budget * 0.6;

                } else if (numOfPeople <= 24) {
                    transport = budget * 0.5;

                } else if (numOfPeople <=49) {
                    transport = budget * 0.4;

                }else {
                    transport = budget * 0.25;
                }

                break;
        }

        double leftPrice = Math.abs(budget- (transport+price));
        if (budget > price+transport) {
            System.out.printf("Yes! You have %.2f leva left.",leftPrice);

        }else {
            System.out.printf("Not enough money! You need %.2f leva.",leftPrice);
        }




    }
}
