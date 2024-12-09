package L01_Exercises;

import java.util.Scanner;

public class exercise05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int penPackages = Integer.parseInt(scanner.nextLine());
        int markerPackages = Integer.parseInt(scanner.nextLine());
        int litters = Integer.parseInt(scanner.nextLine());
        int persentDiscount = Integer.parseInt(scanner.nextLine());

        double PricePenPackages = penPackages * 5.80;
        double PriceMarkerPackages = markerPackages * 7.20;
        double PriceLitters = litters * 1.20;

        double totalPrice = PricePenPackages + PriceMarkerPackages + PriceLitters ;
        double discount = totalPrice * (persentDiscount / 100.0);

        double finalSum = totalPrice - discount;

        System.out.println(finalSum);
        }
    }

