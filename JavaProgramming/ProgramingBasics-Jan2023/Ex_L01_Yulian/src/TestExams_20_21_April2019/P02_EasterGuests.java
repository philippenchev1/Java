package TestExams_20_21_April2019;

import java.util.Scanner;

public class P02_EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int numGuests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        int easterBreadCount = 0;
        int eggsCount = 0;
        double totalPrice = 0;

        easterBreadCount = (int) Math.ceil(numGuests / 3.0 );
        eggsCount = numGuests * 2;
        totalPrice = easterBreadCount * 4 + eggsCount * 0.45;

        if (budget >= totalPrice){
            System.out.printf("Lyubo bought %d Easter bread and %d eggs.%n",easterBreadCount,eggsCount);
            System.out.printf("He has %.2f lv. left.",budget-totalPrice);
        }else {
            System.out.printf("Lyubo doesn't have enough money.%n");
            System.out.printf("He needs %.2f lv. more.",Math.abs(budget-totalPrice));
        }




    }
}
