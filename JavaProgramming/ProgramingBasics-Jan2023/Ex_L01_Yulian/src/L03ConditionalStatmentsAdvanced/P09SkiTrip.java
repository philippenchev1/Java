package L03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class P09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String assessment = scanner.nextLine();

        int nights = days - 1;

        double price = 0;

        switch (roomType){
            case "room for one person":
                price = nights * 18;
                if (assessment.equals("positive")){
                    price = price * 1.25;
                } else if (assessment.equals("negative")) {
                    price = price * 0.9;
                }
                break;

            case "apartment":
                price = nights * 25;
                if (nights<10){
                    price = price * 0.7;
                } else if (nights<15) {
                    price = price * 0.65;
                }else {
                    price = price * 0.5;
                }
                if (assessment.equals("positive")){
                    price = price * 1.25;
                } else if (assessment.equals("negative")) {
                    price = price * 0.9;
                }
                break;

            case "president apartment":
                price = nights * 35;
                if (nights<10){
                    price = price * 0.9;
                } else if (nights<15) {
                    price = price * 0.85;
                }else {
                    price = price * 0.8;
                }
                if (assessment.equals("positive")){
                    price = price * 1.25;
                } else if (assessment.equals("negative")) {
                    price = price * 0.9;
                }

                break;

        }

        System.out.printf("%.2f",price);
    }
}
