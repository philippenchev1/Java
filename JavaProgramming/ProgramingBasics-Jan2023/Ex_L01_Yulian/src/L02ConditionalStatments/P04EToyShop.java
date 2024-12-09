package L02ConditionalStatments;

import java.util.Scanner;

public class P04EToyShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int numberPuzzels = Integer.parseInt(scanner.nextLine());
        int numberDolls = Integer.parseInt(scanner.nextLine());
        int numberBears = Integer.parseInt(scanner.nextLine());
        int numberMinions = Integer.parseInt(scanner.nextLine());
        int numberTrucks = Integer.parseInt(scanner.nextLine());

        double totalSum = numberPuzzels * 2.60 + numberDolls * 3 + numberBears * 4.1 + numberMinions * 8.2 + numberTrucks * 2;

        int toyCount  = numberPuzzels+numberDolls+numberBears+numberMinions+numberTrucks;

        if (toyCount>=50){
            totalSum = totalSum * 0.75;
        }

        totalSum = totalSum * 0.9;

        if (totalSum >=tripPrice){
           double moneyLeft = totalSum- tripPrice;
            System.out.printf("Yes! %.2f lv left",moneyLeft);
        }else {
            double neededMoney = Math.abs(tripPrice-totalSum);
            System.out.printf("Not enough money! %.2f lv needed.",neededMoney);
        }
    }
}
