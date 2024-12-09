package L03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numberFishers = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (season){
            case "Spring":
                price = 3000;
                if (numberFishers<=6){
                    price = price * 0.9;
                } else if (numberFishers<=11) {
                    price = price * 0.85;
                }else {
                    price = price * 0.75;
                }
                    if(numberFishers%2==0){
                        price = price * 0.95;
                    }
                break;

            case "Summer":
                price = 4200;
                if (numberFishers<=6){
                    price = price * 0.9;
                } else if (numberFishers<=11) {
                    price = price * 0.85;
                }else {
                    price = price * 0.75;
                }
                if(numberFishers%2==0){
                    price = price * 0.95;
                }
                break;

            case "Autumn":
                price = 4200;
                if (numberFishers<=6){
                    price = price * 0.9;
                } else if (numberFishers<=11) {
                    price = price * 0.85;
                }else {
                    price = price * 0.75;
                }

                break;

            case "Winter":
                price = 2600;
                if (numberFishers<=6){
                    price = price * 0.9;
                } else if (numberFishers<=11) {
                    price = price * 0.85;
                }else {
                    price = price * 0.75;
                }
                if(numberFishers%2==0){
                    price = price * 0.95;
                }
                break;
        }
        double moneyLeft = Math.abs(budget-price);

        if (budget>=price){
            System.out.printf("Yes! You have %.2f leva left.",moneyLeft);

        }else {
            System.out.printf("Not enough money! You need %.2f leva.",moneyLeft);
        }
    }
}
