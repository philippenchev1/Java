package Exam_Preparation;

import java.util.Scanner;

public class P02_Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double fuel = Double.parseDouble(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        double totalSum =  (fuel * 2.10) + 100;

        if (dayOfWeek.equals("Saturday")){
            totalSum = totalSum * 0.9;
        }else if (dayOfWeek.equals("Sunday")){
            totalSum = totalSum * 0.8;
        }

        if (budget >= totalSum){
            System.out.printf("Safari time! Money left: %.2f lv.",Math.abs(budget-totalSum));
        }else {
            System.out.printf("Not enough money! Money needed: %.2f lv.",Math.abs(budget-totalSum));
        }




    }
}
