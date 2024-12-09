package L02ConditionalStatments;

import java.util.Scanner;

public class P05GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statistsCount = Integer.parseInt(scanner.nextLine());
        double statistClothesPrice = Double.parseDouble(scanner.nextLine());

        double decore = budget * 0.1;
        double priceOfClothes = statistClothesPrice * statistsCount;

        if (statistsCount > 150) {
            priceOfClothes = priceOfClothes * 0.9;

        }

        if (budget >= decore+priceOfClothes) {
            double moneyLeft = Math.abs(budget-(decore+priceOfClothes));
            System.out.printf("Action! %n");
            System.out.printf("Wingard starts filming with %.2f leva left.",moneyLeft);
        } else {
            double moneyNeeded = Math.abs(budget-(decore+priceOfClothes));
            System.out.printf("Not enough money! %n");
            System.out.printf("Wingard needs %.2f leva more.",moneyNeeded);
        }
    }
}
