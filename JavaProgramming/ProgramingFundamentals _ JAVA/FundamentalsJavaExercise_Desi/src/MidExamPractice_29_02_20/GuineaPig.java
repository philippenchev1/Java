package MidExamPractice_29_02_20;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double food = Double.parseDouble(scanner.nextLine());
        double hay = Double.parseDouble(scanner.nextLine());
        double cover = Double.parseDouble(scanner.nextLine());
        double pigsWeight = Double.parseDouble(scanner.nextLine());

        double foodInGrams = food * 1000;
        double hayInGrams = hay * 1000;
        double coverInGrams = cover * 1000;
        double pigsWeightInGrams = pigsWeight * 1000;

        for (int days = 1; days <= 30 ; days++) {
            foodInGrams -= 300;
            if (days % 2 == 0){
                hayInGrams -= (foodInGrams * 0.05);
            }
            if (days % 3 == 0){
                coverInGrams -= pigsWeightInGrams / 3;
            }
        }
        if (foodInGrams <= 0 || hayInGrams <= 0 || coverInGrams <= 0){
            System.out.println("Merry must go to the pet store!");
        } else {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.%n",foodInGrams / 1000,hayInGrams / 1000,coverInGrams / 1000);
        }

    }
}
