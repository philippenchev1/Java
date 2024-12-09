package TestExams_28_29_March2020;

import java.util.Scanner;

public class P04_FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());

        double biscuits = 0;
        double totalEatenFood = 0;
        int totalDogFood = 0;
        int totalCatFood = 0;

        for (int i = 1; i <= days; i++) {
            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0) {
                biscuits += (dogFood + catFood) * 0.1;
            }
            totalEatenFood += dogFood + catFood;
            totalDogFood += dogFood;
            totalCatFood += catFood;
        }

        System.out.printf("Total eaten biscuits: %.0fgr.%n", biscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", totalEatenFood / totalFood * 100);
        System.out.printf("%.2f%% eaten from the dog.%n", totalDogFood / totalEatenFood * 100);
        System.out.printf("%.2f%% eaten from the cat.%n", totalCatFood / totalEatenFood * 100);
    }
}
