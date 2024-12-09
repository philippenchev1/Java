package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P05SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        град / продукт	coffee	water	beer	sweets	peanuts
//                  Sofia	0.50	0.80	1.20	1.45	1.60
//                  Plovdiv	0.40	0.70	1.15	1.30	1.50
//                  Varna	0.45	0.70	1.10	1.35	1.55

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0;

        if (town.equals("Sofia")) {
            if (product.equals("coffee")) {
                price = quantity * 0.50;
            } else if (product.equals("water")) {
                price = quantity * 0.80;
            } else if (product.equals("beer")) {
                price = quantity * 1.20;
            } else if (product.equals("sweets")) {
                price = quantity * 1.45;
            } else if (product.equals("peanuts")) {
                price = quantity * 1.60;
            }

        } else if (town.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                price = quantity * 0.40;
            } else if (product.equals("water")) {
                price = quantity * 0.70;
            } else if (product.equals("beer")) {
                price = quantity * 1.15;
            } else if (product.equals("sweets")) {
                price = quantity * 1.30;
            } else if (product.equals("peanuts")) {
                price = quantity * 1.50;
            }

        } else if (town.equals("Varna")) {
            if (product.equals("coffee")) {
                price = quantity * 0.45;
            } else if (product.equals("water")) {
                price = quantity * 0.70;
            } else if (product.equals("beer")) {
                price = quantity * 1.10;
            } else if (product.equals("sweets")) {
                price = quantity * 1.35;
            } else if (product.equals("peanuts")) {
                price = quantity * 1.55;
            }

        }
            System.out.println(price);
    }
}
