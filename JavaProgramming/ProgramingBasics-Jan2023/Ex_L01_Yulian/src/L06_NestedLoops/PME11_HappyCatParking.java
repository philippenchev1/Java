package L06_NestedLoops;

import java.util.Scanner;

public class PME11_HappyCatParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;


        for (int i = 1; i <= days ; i++) {
            double pricePerDay = 0;
            double pricePerHour ;
            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0 && j % 2 != 0){
                    pricePerHour = 2.5 ;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    pricePerHour = 1.25 ;
                }else {
                    pricePerHour = 1.0 ;

                }
                pricePerDay += pricePerHour;

            }
            totalPrice += pricePerDay;
            System.out.printf("Day: %d - %.2f leva%n",i,pricePerDay);

        }
        System.out.printf("Total: %.2f leva",totalPrice);


    }
}
