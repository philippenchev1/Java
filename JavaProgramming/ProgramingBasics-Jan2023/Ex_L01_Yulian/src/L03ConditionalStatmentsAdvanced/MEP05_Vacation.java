package L03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class MEP05_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        String seasen = scanner.nextLine();

        String location = "";
        String place = "";
        double price = 0;


        switch (seasen){
            case "Summer":
                location = "Alaska";
                if (budget<=1000){
                    place = "Camp";
                    price = budget * 0.65;
                } else if (budget <= 3000) {
                    place = "Hut";
                    price = budget * 0.8;
                } else {
                    place = "Hotel";
                    price = budget * 0.9;
                }
                break;
            case  "Winter":
                location = "Morocco";
                if (budget<=1000){
                    place = "Camp";
                    price = budget * 0.45;
                } else if (budget <= 3000) {
                    place = "Hut";
                    price = budget * 0.6;
                } else {
                    place = "Hotel";
                    price = budget * 0.9;
                }
                break;
        }

        System.out.printf("%s - %s - %.2f",location,place,price);

    }
}
