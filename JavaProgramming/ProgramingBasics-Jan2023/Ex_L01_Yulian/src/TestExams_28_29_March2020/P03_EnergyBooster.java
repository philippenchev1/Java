package TestExams_28_29_March2020;

import java.util.Scanner;

public class P03_EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int countSets = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (fruit){
            case "Watermelon":
                switch (size){
                    case "small":
                        price = countSets * (2 * 56.0);
                        break;
                    case "big":
                        price = countSets* (5 * 28.7);
                        break;
                }
                break;
            case "Mango":
                switch (size){
                    case "small":
                        price = countSets * (2 * 36.66);
                        break;
                    case "big":
                        price = countSets * (5 * 19.6);
                        break;
                }
                break;
            case "Pineapple":
                switch (size){
                    case "small":
                        price = countSets * (2 * 42.10);
                        break;
                    case "big":
                        price = countSets * (5 * 24.80);
                        break;
                }
                break;
            case "Raspberry":
                switch (size){
                    case "small":
                        price = countSets * (2 * 20.0);
                        break;
                    case "big":
                        price = countSets * (5 * 15.20);
                        break;
                }
                break;
        }

        if (price >= 400 && price <= 1000){
            price = price * 0.85;
        } else if (price > 1000) {
            price = price * 0.5;

        }

        System.out.printf("%.2f lv.",price);


    }
}
