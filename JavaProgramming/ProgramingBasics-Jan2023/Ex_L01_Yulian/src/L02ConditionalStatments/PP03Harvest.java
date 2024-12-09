package L02ConditionalStatments;

import java.util.Scanner;

public class PP03Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*От лозе с площ X квадратни метри се заделя 40% от реколтата за производство на вино.
        От 1 кв.м лозе се изкарват Y килограма грозде.
        За 1 литър вино са нужни 2,5 кг. грозде.
        Желаното количество вино за продан е Z литра.
        Напишете програма, която пресмята колко вино може да се произведе и дали това количество е достатъчно.
        Ако е достатъчно, остатъкът се разделя по равно между работниците на лозето.
        */

        int vineyardSqM = Integer.parseInt(scanner.nextLine());
        double grapeForSqM = Double.parseDouble(scanner.nextLine());
        int neededLitresWine = Integer.parseInt(scanner.nextLine());
        int numberWorkers = Integer.parseInt(scanner.nextLine());

        double allGrape = vineyardSqM * grapeForSqM;
        double wine = Math.floor(allGrape * 0.4)/2.5;

        if (wine >= neededLitresWine){
            double excessWine =Math.ceil(wine-neededLitresWine);
            double litterPerPerson =Math.ceil (excessWine/numberWorkers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters. %n",wine);
            System.out.printf("%.0f liters left -> %.0f liters per person.",excessWine,litterPerPerson);
        } else {
            double notEnoughWine = neededLitresWine-wine;
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",Math.floor(notEnoughWine));
        }
    }
}
