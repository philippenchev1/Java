package L02ConditionalStatments;

import java.util.Scanner;

public class PP06FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolies = Integer.parseInt(scanner.nextLine());
        int zyumbyuls = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactuses = Integer.parseInt(scanner.nextLine());
        double priceOfGift = Double.parseDouble(scanner.nextLine());

        double priceOfBuquete = (magnolies * 3.25)+(zyumbyuls * 4.0) + (roses * 3.5) + (cactuses*8.0);
        double taxes = priceOfBuquete * 0.05;
        double finalPrice = priceOfBuquete-taxes;

        if (priceOfGift <= finalPrice){
            double leftMoney = Math.ceil(priceOfGift-finalPrice);
            System.out.printf("She is left with %.0f leva.",Math.abs(leftMoney));
        } else {
            double neededMoney = Math.floor(finalPrice - priceOfGift);
            System.out.printf("She will have to borrow %.0f leva.",Math.abs(neededMoney));
        }
    }
}
