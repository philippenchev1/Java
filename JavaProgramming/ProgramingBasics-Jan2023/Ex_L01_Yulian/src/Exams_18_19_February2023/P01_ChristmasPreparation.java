package Exams_18_19_February2023;

import java.util.Scanner;

public class P01_ChristmasPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paperRolls = Integer.parseInt(scanner.nextLine());
        int clothRolls = Integer.parseInt(scanner.nextLine());
        double litersGlow = Double.parseDouble(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double totalPrice = (paperRolls * 1.0 * 5.80) + (clothRolls * 1.0 * 7.20) + (litersGlow * 1.20);
        double finalPrice = totalPrice - (totalPrice / 100 * percentDiscount );


        System.out.printf("%.3f",finalPrice);



    }
}
