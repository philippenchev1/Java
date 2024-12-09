package TestExams_9_10March2019;

import java.util.Scanner;

public class P01_TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double finalPriceDjockovich = 0;
        double finalPriceSponsors = 0;

        double racketPrice = Double.parseDouble(scanner.nextLine());
        int numRackets = Integer.parseInt(scanner.nextLine());
        int numSneakers = Integer.parseInt(scanner.nextLine());

        double sumRacketPrice = racketPrice * numRackets;
        double sneakersPrice = numSneakers * racketPrice / 6;
        double accessories = (sneakersPrice + sumRacketPrice) * 0.2;


        finalPriceDjockovich = (sumRacketPrice + sneakersPrice + accessories) / 8;
        finalPriceSponsors = finalPriceDjockovich * 7 ;

        System.out.printf("Price to be paid by Djokovic %.0f%n",Math.floor(finalPriceDjockovich));
        System.out.printf("Price to be paid by sponsors %.0f",Math.ceil(finalPriceSponsors));

    }
}
