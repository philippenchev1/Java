package L02ConditionalStatments;

import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int bearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int truksCount = Integer.parseInt(scanner.nextLine());

        int alltoys = puzzleCount+dollsCount+bearsCount+minionsCount+truksCount;

        double allToysPrice = puzzleCount * 2.6 + dollsCount * 3 + bearsCount * 4.10 + minionsCount * 8.2 + truksCount * 2;

        if (alltoys >= 50) {
            allToysPrice = allToysPrice - allToysPrice * 0.25;

        }
            allToysPrice = allToysPrice * 0.9;

        if (allToysPrice >= tripPrice) {
            double moneyLeft = allToysPrice - tripPrice;
            System.out.printf("Yes! %.2f lv left.",moneyLeft);
        } else {
            double neededMoney = tripPrice - allToysPrice;
            System.out.printf("Not enough money! %.2f lv needed.",neededMoney);
            }
        }
    }

