package L01_Exercises;

import java.util.Scanner;

public class P06_Repainting {

    public static void main() {
        main();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int needeNylon = Integer.parseInt(scanner.nextLine());
        int needePaint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (needeNylon + 2) * 1.50;
        double paintPrice = (needePaint + (needePaint * 0.1)) * 14.50;
        double thinnerPrice = thinner * 5.00;

        double materialsSum = nylonPrice + paintPrice + thinnerPrice + 0.40;

        double priceForbuilders = hours * (materialsSum * 0.30);
        double  finalSum = priceForbuilders + materialsSum;


        System.out.println(finalSum );

        }



    }
