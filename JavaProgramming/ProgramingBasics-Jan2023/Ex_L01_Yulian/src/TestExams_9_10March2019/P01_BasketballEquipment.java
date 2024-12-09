package TestExams_9_10March2019;

import java.util.Scanner;

public class P01_BasketballEquipment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        int tax = Integer.parseInt((scanner.nextLine()));

        double tainersPrice = tax - ( tax * 0.4);
        double suitPrice = tainersPrice * 0.8;
        double ball = suitPrice * 0.25;
        double accessories = ball * 0.2;


        double finalPrice = tainersPrice + tax + suitPrice + ball + accessories;

        System.out.printf("%.2f",finalPrice);


    }

}