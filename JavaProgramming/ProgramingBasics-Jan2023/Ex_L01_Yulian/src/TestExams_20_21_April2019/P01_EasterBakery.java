package TestExams_20_21_April2019;

import java.util.Scanner;

public class P01_EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = 0;

        double  flourPricePerKilo = Double.parseDouble(scanner.nextLine());
        double  flourKilos = Double.parseDouble(scanner.nextLine());
        double  sugarKg = Double.parseDouble(scanner.nextLine());
        int  eggsShels = Integer.parseInt(scanner.nextLine());
        int  yeastPacks = Integer.parseInt(scanner.nextLine());

        price = flourKilos * flourPricePerKilo + (sugarKg * (flourPricePerKilo * 0.75)) +
                (eggsShels * (flourPricePerKilo * 1.1)) + (yeastPacks * (flourPricePerKilo * 0.75)*0.2);

        System.out.printf("%.2f",price);





    }
}
