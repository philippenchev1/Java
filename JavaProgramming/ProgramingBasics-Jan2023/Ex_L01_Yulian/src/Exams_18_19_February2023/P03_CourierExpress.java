package Exams_18_19_February2023;

import java.util.Scanner;

public class P03_CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double shipmentKilos = Double.parseDouble(scanner.nextLine());
        String service = scanner.nextLine();
        int distanceKm = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (service){
            case "standard":
                if (shipmentKilos < 1){
                    price = distanceKm * 0.03;
                }else if (shipmentKilos >= 1 && shipmentKilos < 10){
                    price = distanceKm * 0.05;
                } else if (shipmentKilos >= 10 && shipmentKilos < 40) {
                    price = distanceKm * 0.1;
                } else if (shipmentKilos >= 40 && shipmentKilos < 90) {
                    price = distanceKm * 0.15;
                } else if (shipmentKilos >= 90 && shipmentKilos < 150) {
                    price = distanceKm * 0.2;
                }
                break;
            case "express":
                if (shipmentKilos < 1){
                    price = distanceKm * 0.03 + ((0.03*0.8*shipmentKilos)*distanceKm);
                }else if (shipmentKilos >= 1 && shipmentKilos < 10){
                    price = distanceKm * 0.05 + ((0.05*0.4*shipmentKilos)*distanceKm);
                } else if (shipmentKilos >= 10 && shipmentKilos < 40) {
                    price = distanceKm * 0.1 + ((0.1*0.05*shipmentKilos)*distanceKm);
                } else if (shipmentKilos >= 40 && shipmentKilos < 90) {
                    price = distanceKm * 0.15 + ((0.15*0.02*shipmentKilos)*distanceKm);
                } else if (shipmentKilos >= 90 && shipmentKilos < 150) {
                    price = distanceKm * 0.2 + ((0.2*0.01*shipmentKilos)*distanceKm);
                }
                break;
        }

        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.",shipmentKilos,price);


    }
}
