package TestExams_6_7_July2019;

import java.util.Scanner;

public class P02_FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numNights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int percentAdditionalCost = Integer.parseInt(scanner.nextLine());



        if (numNights > 7){
            pricePerNight = pricePerNight * 0.95;
        }

        double totalCost = numNights * pricePerNight + (percentAdditionalCost * (budget/100));

        if (budget >= totalCost){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",budget-totalCost);
        }else {
            System.out.printf("%.2f leva needed.",Math.abs(budget-totalCost));
        }




    }
}
