package L02ConditionalStatments;

import java.util.Scanner;

public class PP05Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodInKg = Integer.parseInt(scanner.nextLine());
        double dogFoodForDay = Double.parseDouble(scanner.nextLine());
        double catFoodForDay = Double.parseDouble(scanner.nextLine());
        double turtleFoodForDay = Double.parseDouble(scanner.nextLine());

        double allFoodForDay = days*(dogFoodForDay+catFoodForDay+(turtleFoodForDay/1000));

        if (foodInKg >=allFoodForDay){
            double foodLeft =Math.floor(foodInKg - allFoodForDay);
            System.out.printf("%.0f kilos of food left.",foodLeft);
        }else {
            double foodNeed = Math.ceil(allFoodForDay-foodInKg);
            System.out.printf("%.0f more kilos of food are needed.",foodNeed);
        }
    }
}
