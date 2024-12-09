package TestExams_15_16_June2019;

import java.util.Scanner;

public class P05_Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numSerials = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        for (int i = 1; i <= numSerials ; i++) {
            String name = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());


            if (name.equals("Thrones")){
                price = price * 0.5;
                totalPrice += price;
            } else if (name.equals("Lucifer")) {
                price = price * 0.6;
                totalPrice += price;

            }else if (name.equals("Protector")) {
                price = price * 0.7;
                totalPrice += price;

            }else if (name.equals("TotalDrama")) {
                price = price * 0.8;
                totalPrice += price;

            }else if (name.equals("Area")) {
                price = price * 0.9;
                totalPrice += price;

            }else {
                totalPrice += price;
            }

        }

        if (budget >= totalPrice){
            System.out.printf("You bought all the series and left with %.2f lv.",budget-totalPrice);
        }else {
            System.out.printf("You need %.2f lv. more to buy the series!",Math.abs(budget-totalPrice));
        }


    }
}
