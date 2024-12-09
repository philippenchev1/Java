package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P12TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double income = Double.parseDouble(scanner.nextLine());

        double commision = 0;

//        Град	0 ≤ s ≤ 500 	500 < s ≤ 1 000 	1 000 < s ≤ 10 000	 s > 10 000
//        Sofia 	5%	           7%	            8%	            12%
//        Varna	    4.5%	      7.5%	            10%             13%
//        Plovdiv	5.5%	       8%	            12%	            14.5%

        if (town.equals("Sofia")) {
            if (income >= 0 && income <= 500) {
                commision = income * 0.05;
            } else if (income > 500 && income <= 1000) {
                commision = income * 0.07;

            } else if (income > 1000 && income <= 10000) {
                commision = income * 0.08;

            } else if (income > 10000) {
                commision = income * 0.12;

            } else {
                System.out.println("error");
            }
        } else if (town.equals("Varna")) {
            if (income >= 0 && income <= 500) {
                commision = income * 0.045;
            } else if (income > 500 && income <= 1000) {
                commision = income * 0.075;

            } else if (income > 1000 && income <= 10000) {
                commision = income * 0.1;

            } else if (income > 10000) {
                commision = income * 0.13;

            } else {
                System.out.println("error");

            }

        } else if (town.equals("Plovdiv")) {
            if (income >= 0 && income <= 500) {
                commision = income * 0.055;
            } else if (income > 500 && income <= 1000) {
                commision = income * 0.08;

            } else if (income > 1000 && income <= 10000) {
                commision = income * 0.12;

            } else if (income > 10000) {
                commision = income * 0.145;

            } else {
                System.out.println("error");
            }

        }else {
            System.out.println("error");
        }

        if (commision>0){
            System.out.printf("%.2f",commision);;
        }
    }
}