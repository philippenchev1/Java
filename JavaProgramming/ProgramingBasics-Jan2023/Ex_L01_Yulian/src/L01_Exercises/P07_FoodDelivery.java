package L01_Exercises;

import java.util.Scanner;

public class P07_FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegiMenu = Integer.parseInt(scanner.nextLine());

        double chikenMenuPrice = 10.35 * chickenMenu;
        double fishMenuPrice = 12.40 * fishMenu;
        double vegiMenuPrice = 8.15 * vegiMenu;
        double desert = (chikenMenuPrice + fishMenuPrice + vegiMenuPrice) * 0.2;
        double delivery = 2.50;
        double finalSumwithoutDelivery = chikenMenuPrice+fishMenuPrice+vegiMenuPrice;




        double finalSum = finalSumwithoutDelivery + desert + delivery ;

        System.out.println(finalSum);

        }


    }

