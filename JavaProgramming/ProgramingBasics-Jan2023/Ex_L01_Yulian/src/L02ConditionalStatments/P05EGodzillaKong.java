package L02ConditionalStatments;

import java.util.Scanner;

public class P05EGodzillaKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double priceOfClothesForOneStatist = Double.parseDouble(scanner.nextLine());

        double decore = budget * 0.1;
        double priceForClothes = priceOfClothesForOneStatist * statists;

        if (statists>150){
            priceForClothes = priceForClothes * 0.9;

        }

        if (budget>= decore+priceForClothes){

            double moneyMore =budget -(priceForClothes+decore);
            System.out.printf("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",moneyMore);
        }else {
            double neededMoney = Math.abs(budget-(priceForClothes+decore));
            System.out.printf("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more",neededMoney);

        }
    }
}
