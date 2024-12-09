package TestExams_2_3_May2019;

import java.util.Scanner;

public class P03_MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String yearsOfContract = scanner.nextLine();
        String typeContract = scanner.nextLine();
        String internet = scanner.nextLine();
        int countMonths = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;


        switch (yearsOfContract){
            case "one":
                switch (typeContract){
                    case "Small":
                        totalPrice = countMonths * 9.98;
                        if (internet.equals("yes")){
                            totalPrice = countMonths * (9.98 + 5.50);
                        }
                        break;
                    case "Middle":
                        totalPrice = countMonths * 18.99;
                        if (internet.equals("yes")){
                            totalPrice = countMonths * (18.99 + 4.35);
                        }
                        break;
                    case "Large":
                        totalPrice = countMonths * 25.98;
                        if (internet.equals("yes")){
                            totalPrice = countMonths * (25.98 + 4.35);
                        }
                        break;
                    case "ExtraLarge":
                        totalPrice = countMonths * 35.99;
                        if (internet.equals("yes")){
                            totalPrice = countMonths * (35.99 + 3.85);
                        }
                        break;
                }
                break;
            case "two":
                switch (typeContract){
                case "Small":
                    totalPrice = countMonths * 8.58;
                    if (internet.equals("yes")){
                        totalPrice = countMonths * (8.58 + 5.50);
                    }
                    break;
                case "Middle":
                    totalPrice = countMonths * 17.09;
                    if (internet.equals("yes")){
                        totalPrice = countMonths * (17.09 + 4.35);
                    }
                    break;
                case "Large":
                    totalPrice = countMonths * 23.59;
                    if (internet.equals("yes")){
                        totalPrice = countMonths * (23.59 + 4.35);
                    }
                    break;
                case "ExtraLarge":
                    totalPrice = countMonths * 31.79;
                    if (internet.equals("yes")){
                        totalPrice = countMonths * (31.79 + 3.85);
                    }
                    break;
            }
                break;
        }

        if (yearsOfContract.equals("two")){
            totalPrice = totalPrice * 0.9625;
        }

        System.out.printf("%.2f lv.",totalPrice);


    }
}
