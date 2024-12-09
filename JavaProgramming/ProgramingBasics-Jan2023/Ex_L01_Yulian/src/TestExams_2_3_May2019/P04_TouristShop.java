package TestExams_2_3_May2019;

import java.util.Scanner;

public class P04_TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();

        int countProducts = 0;
        double totalPrice = 0;

        while (!"Stop".equals(command)){
            String nameOfProduct = command;
            double price = Double.parseDouble(scanner.nextLine());
            countProducts++;




            if (countProducts % 3 == 0){
                price = price * 0.5;
            }

            totalPrice += price;

            if (totalPrice > budget) {
                break;
            }

            command = scanner.nextLine();


        }

        if (totalPrice > budget){
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", Math.abs(budget - totalPrice));
        } else {
            System.out.printf("You bought %d products for %.2f leva.", countProducts, totalPrice);
        }


    }
}
