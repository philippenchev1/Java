package L02ConditionalStatments;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class PP08FT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double liters = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();

        double price = 0;

        if (fuel.equals("Gas") && clubCard.equals("Yes")) {
            price = 0.85*liters;
            if (liters >= 20 && liters <= 25) {
                price = price * 0.92;
            }
            if (liters > 25) {
                price = price * 0.9;

            }
        }

        if (fuel.equals("Gas") && clubCard.equals("No")) {
            price = liters * 0.93;
            if (liters >= 20 && liters <= 25) {
                price = price * 0.92;
            }
            if (liters > 25) {
                price = price * 0.9;

            }
        }

        if (fuel.equals("Gasoline") && clubCard.equals("Yes")) {
            price = liters * 2.04;
            if (liters >= 20 && liters <= 25) {
                price = price * 0.92;
            }
            if (liters > 25) {
                price = price * 0.9;
            }
        }

        if (fuel.equals("Gasoline") && clubCard.equals("No")) {
            price =  2.22*liters;
            if (liters >= 20 && liters <= 25) {
                price = price * 0.92;
            }
            if (liters > 25) {
                price = price * 0.9;
            }
        }

        if (fuel.equals("Diesel") && clubCard.equals("Yes")) {
            price = 2.21*liters;

            if (liters >= 20 && liters <= 25) {
                price = price * 0.92;
            }
            if (liters > 25) {
                price = price * 0.9;
            }
        }

        if (fuel.equals("Diesel")&& clubCard.equals("No")) {
            price = 2.33*liters;

            if (liters >= 20 && liters <= 25) {
                price = price * 0.92;
            }
            if (liters > 25) {
                price = price * 0.9;
            }
        }

        System.out.printf("%.2f lv.",price);
    }

}
