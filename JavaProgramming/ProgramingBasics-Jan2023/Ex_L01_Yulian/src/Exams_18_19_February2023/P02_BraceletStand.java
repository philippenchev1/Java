package Exams_18_19_February2023;

import java.util.Scanner;

public class P02_BraceletStand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pocketMoney = Double.parseDouble(scanner.nextLine());
        double profitPerDay = Double.parseDouble(scanner.nextLine());
        double expenses = Double.parseDouble(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double sumMoney = (pocketMoney * 5.0) + (profitPerDay * 5.0) - expenses;


        if (sumMoney >= giftPrice){
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.",sumMoney);
        }else {
            System.out.printf("Insufficient money: %.2f BGN.",Math.abs(sumMoney-giftPrice));
        }





    }
}
