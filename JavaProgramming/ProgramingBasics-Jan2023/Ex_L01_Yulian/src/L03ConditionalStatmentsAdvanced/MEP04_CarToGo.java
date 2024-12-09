package L03ConditionalStatmentsAdvanced;

import java.nio.DoubleBuffer;
import java.util.Scanner;

public class MEP04_CarToGo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String classOfVehicle = "";
        String carType = "";
        double price = 0;

        switch (season){
            case "Summer":
                if (budget <= 100){
                    classOfVehicle = "Economy class";
                    carType = "Cabrio";
                    price = budget * 0.35;
                } else if (budget <= 500) {
                    classOfVehicle = "Compact class";
                    carType = "Cabrio";
                    price = budget * 0.45;
                } else {
                    classOfVehicle = "Luxury class";
                    carType = "Jeep";
                    price = budget * 0.9;
                }
                break;
            case "Winter":
                if (budget <= 100) {
                    classOfVehicle = "Economy class";
                    carType = "Jeep";
                    price = budget * 0.65;
                }else if (budget <= 500) {
                    classOfVehicle = "Compact class";
                    carType = "Jeep";
                    price = budget * 0.8;

                }else {
                    classOfVehicle = "Luxury class";
                    carType = "Jeep";
                    price = budget * 0.9;
                }
                break;
        }

        System.out.printf("%s%n",classOfVehicle);
        System.out.printf("%s - %.2f",carType,price);




    }


}
