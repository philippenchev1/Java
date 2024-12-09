package TestExams_20_21_April2019;

import java.util.Scanner;

public class P05_EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBreadCount = Integer.parseInt(scanner.nextLine());

        int sugarMax = 0;
        int flourMax = 0;
        int totalSugar = 0;
        int totalFlour = 0;



        for (int i = 1; i <= easterBreadCount ; i++) {
            int sugarGrams = Integer.parseInt(scanner.nextLine());
            int flourGrams = Integer.parseInt(scanner.nextLine());

            totalSugar += sugarGrams;
            totalFlour += flourGrams;

            if (sugarGrams >= sugarMax){
                sugarMax = sugarGrams;
            }
            if (flourGrams >= flourMax){
                flourMax = flourGrams;
            }

        }
        int sugarPacks = (int) Math.ceil(totalSugar / 950.0);
        int flourPacks = (int) Math.ceil( totalFlour / 750.0);

        System.out.printf("Sugar: %d%n",sugarPacks);
        System.out.printf("Flour: %d%n",flourPacks);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.",flourMax,sugarMax);


    }
}
