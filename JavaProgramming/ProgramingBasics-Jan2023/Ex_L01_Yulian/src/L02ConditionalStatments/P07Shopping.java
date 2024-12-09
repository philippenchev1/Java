package L02ConditionalStatments;

import java.util.Scanner;

public class P07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budgetOfPeter = Double.parseDouble(scanner.nextLine());
        int videoCardsCount =Integer.parseInt(scanner.nextLine());
        int procesorsCount =Integer.parseInt(scanner.nextLine());
        int ramsCount =Integer.parseInt(scanner.nextLine());

        double videoCardsCOst = videoCardsCount * 250.0;
        double procesorsCost = procesorsCount * (videoCardsCOst* 0.35);
        double  ramCost = ramsCount * (videoCardsCOst* 0.1);
        double totalCost = videoCardsCOst+procesorsCost+ramCost;

        if (videoCardsCount > procesorsCount) {
            totalCost = totalCost - (totalCost * 0.15);
        }
        if (budgetOfPeter>=totalCost) {
            double budgetLeft = budgetOfPeter - totalCost;
            System.out.printf("You have %.2f leva left!",budgetLeft);
        }else{
            double neededMoney = Math.abs(totalCost-budgetOfPeter);
            System.out.printf("Not enough money! You need %.2f leva more!",neededMoney);

        }

    }
}
