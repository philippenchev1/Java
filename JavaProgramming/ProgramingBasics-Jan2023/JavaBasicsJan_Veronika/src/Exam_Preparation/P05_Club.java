package Exam_Preparation;

import java.util.Scanner;

public class P05_Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double income = Double.parseDouble(scanner.nextLine());

        double totalSum = 0;
        String input = scanner.nextLine();
        while (!input.equals("Party!")) {
            String cocktailName = input;
            int cocktailsCount = Integer.parseInt(scanner.nextLine());

            double sumCurrentOrder = cocktailName.length() * cocktailsCount;
            if (sumCurrentOrder % 2 != 0) {
                sumCurrentOrder = sumCurrentOrder * 0.75;
            }

            totalSum = totalSum + sumCurrentOrder;
            if (totalSum >= income) {
                break;
            }

            input = scanner.nextLine();
        }

        if (income > totalSum) {
            double diff = income - totalSum;
            System.out.printf("We need %.2f leva more.%n", diff);
        } else {
            System.out.println("Target acquired.");
        }

        System.out.printf("Club income - %.2f leva.%n", totalSum);
    }
}


