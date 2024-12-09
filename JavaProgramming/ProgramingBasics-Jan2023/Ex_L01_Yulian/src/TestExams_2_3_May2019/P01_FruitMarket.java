package TestExams_2_3_May2019;

import java.util.Scanner;

public class P01_FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double countBananasKg = Double.parseDouble(scanner.nextLine());
        double countOrangesKg = Double.parseDouble(scanner.nextLine());
        double countRaspberryKg = Double.parseDouble(scanner.nextLine());
        double countStrawberryKg = Double.parseDouble(scanner.nextLine());

        double raspberryPrice = strawberryPrice * 0.5;
        double orangePrice = raspberryPrice * 0.6;
        double bananaPrice = raspberryPrice * 0.2;

        double finalPrice = (countStrawberryKg * strawberryPrice) + (countBananasKg * bananaPrice) + (countOrangesKg * orangePrice) + (countRaspberryKg *raspberryPrice );

        System.out.printf("%.2f",finalPrice);


    }
}
