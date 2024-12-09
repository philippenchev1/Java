package TestExams_6_7_April2019;

import java.util.Scanner;

public class P02_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        int countStatists = Integer.parseInt(scanner.nextLine());
        double clothesPrise  = Double.parseDouble(scanner.nextLine());


        double decorPrice =  budget * 0.1;
        double clothesPriceAll = countStatists * clothesPrise;


        if (countStatists > 150){
            clothesPriceAll = clothesPriceAll * 0.9;
        }
        double totalPrice = decorPrice + clothesPriceAll;

        if (budget >= totalPrice){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",budget - totalPrice);
        }else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",Math.abs(totalPrice-budget));
        }



    }
}
