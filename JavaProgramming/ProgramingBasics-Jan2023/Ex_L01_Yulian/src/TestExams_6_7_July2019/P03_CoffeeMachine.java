package TestExams_6_7_July2019;

import java.util.Scanner;

public class P03_CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int numDrinks = Integer.parseInt(scanner.nextLine());

        double finalPrice = 0;


        if (drink.equals("Espresso")) {
            if (sugar.equals("Without")) {
                finalPrice = (numDrinks * 0.9) * 0.65;
            } else if (sugar.equals("Normal")) {
                finalPrice = numDrinks * 1.0;
            } else if (sugar.equals("Extra")) {
                finalPrice = numDrinks * 1.2;
            }
            if (numDrinks >= 5) {
                finalPrice = finalPrice * 0.75;
            }
        } else if (drink.equals("Cappuccino")) {
            if (sugar.equals("Without")) {
                finalPrice = (numDrinks * 1.0)*0.65;
            } else if (sugar.equals("Normal")) {
                finalPrice = numDrinks * 1.2;
            } else if (sugar.equals("Extra")) {
                finalPrice = numDrinks * 1.6;
            }
        } else if (drink.equals("Tea")) {
            if (sugar.equals("Without")) {
                finalPrice = (numDrinks * 0.5)* 0.65;
            } else if (sugar.equals("Normal")) {
                finalPrice = numDrinks * 0.6;
            } else if (sugar.equals("Extra")) {
                finalPrice = numDrinks * 0.7;
            }
        }

        if (finalPrice > 15){
            finalPrice = finalPrice * 0.8;
        }


        System.out.printf("You bought %d cups of %s for %.2f lv.",numDrinks,drink,finalPrice);


    }
}
