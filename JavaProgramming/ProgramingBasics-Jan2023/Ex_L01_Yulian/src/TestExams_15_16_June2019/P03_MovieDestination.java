package TestExams_15_16_June2019;

import java.util.Scanner;

public class P03_MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int countDays = Integer.parseInt(scanner.nextLine());

        double totalMoney = 0;

        //Dubai	        Sofia	    London
        //45 000 lv.	17 000 lv.	24 000 lv.
        //40 000 lv.	12 500 lv.	20 250 lv.


        switch (destination){
            case "Dubai":
                switch (season){
                    case "Summer":
                        totalMoney = (countDays * 40000) * 0.7;
                        break;
                    case "Winter":
                        totalMoney = (countDays * 45000) * 0.7;
                        break;
                }
                break;
            case "Sofia":
                switch (season) {
                    case "Summer":
                        totalMoney = (countDays * 12500) * 1.25;
                        break;
                    case "Winter":
                        totalMoney = (countDays * 17000) * 1.25;
                        break;
                }
                break;
            case "London":
                switch (season){
                    case "Summer":
                        totalMoney = (countDays * 20250) ;
                        break;
                    case "Winter":
                        totalMoney = (countDays * 24000) ;
                        break;
                }

                break;
        }

            if (budget >= totalMoney){
                System.out.printf("The budget for the movie is enough! We have %.2f leva left!",budget-totalMoney);
            }else {
                System.out.printf("The director needs %.2f leva more!",Math.abs(totalMoney-budget));
            }


    }
}
