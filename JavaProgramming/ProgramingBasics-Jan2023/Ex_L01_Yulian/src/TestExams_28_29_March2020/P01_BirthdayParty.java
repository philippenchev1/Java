package TestExams_28_29_March2020;

import java.util.Scanner;

public class P01_BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rentPerHall = Double.parseDouble(scanner.nextLine());

        double cakePrice = rentPerHall * 0.2;
        double drinksPrice = cakePrice * 0.55;
        double animator = rentPerHall / 3;

        double finalPrice = rentPerHall + cakePrice + drinksPrice + animator;

        System.out.printf("%.1f",finalPrice);


    }
}
