package TestExams_20_21_April2019;

import java.util.Scanner;

public class P06_EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int clients = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;


        for (int i = 1; i <= clients ; i++) {
            String purchase = scanner.nextLine();
            int purchaseCounter = 0;
            double price = 0;


            while (!purchase.equals("Finish")){
                purchaseCounter++;
                switch (purchase){
                    case "basket":
                        price += 1.50;
                        break;
                    case "wreath":
                        price += 3.80;
                        break;
                    case "chocolate bunny":
                        price += 7.0;
                        break;
                }


                purchase = scanner.nextLine();
            }

            if (purchaseCounter % 2 == 0 ){
                price = price * 0.8;
            }

            System.out.printf("You purchased %d items for %.2f leva.%n",purchaseCounter,price);
            totalPrice +=price;
        }
        System.out.printf("Average bill per client is: %.2f leva.",totalPrice / clients);








    }
}
