package L03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class MEP03_Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numChrysanthemum = Integer.parseInt(scanner.nextLine());
        int numRoses = Integer.parseInt(scanner.nextLine());
        int numTulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double bouquetPrice = 0;
        double chrysanthemumPrice = 0;
        double rosesPrice = 0;
        double tulipsPrice = 0;


        switch (season){
            case "Spring":
            case "Summer":
                chrysanthemumPrice = numChrysanthemum * 2;
                rosesPrice = numRoses * 4.10;
                tulipsPrice = numTulips * 2.50;
                bouquetPrice = chrysanthemumPrice + rosesPrice + tulipsPrice;
                if (numTulips >7){
                    bouquetPrice = bouquetPrice * 0.95;

                }

                break;
            case "Autumn":
                chrysanthemumPrice = numChrysanthemum * 3.75;
                rosesPrice = numRoses * 4.50;
                tulipsPrice = numTulips * 4.15;
                bouquetPrice = chrysanthemumPrice + rosesPrice + tulipsPrice;


                break;
            case "Winter":
                chrysanthemumPrice = numChrysanthemum * 3.75;
                rosesPrice = numRoses * 4.50;
                tulipsPrice = numTulips * 4.15;
                bouquetPrice = chrysanthemumPrice + rosesPrice + tulipsPrice;
                if (numRoses >= 10){
                    bouquetPrice = bouquetPrice * 0.9;
                }
                break;
        }
            if (numChrysanthemum+numRoses+numTulips > 20){
                bouquetPrice = bouquetPrice * 0.8;
            }

            if (holiday.equals("Y")){
                bouquetPrice = bouquetPrice * 1.15;
            } else if (holiday.equals("N")) {
                bouquetPrice = bouquetPrice;

            }

            double bouquetFinalPrice = bouquetPrice + 2;

        System.out.printf("%.2f",bouquetFinalPrice);



    }
}
