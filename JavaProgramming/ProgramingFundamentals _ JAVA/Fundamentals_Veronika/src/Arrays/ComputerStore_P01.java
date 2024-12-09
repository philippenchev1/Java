package Arrays;

import java.util.Scanner;

public class ComputerStore_P01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        double sum = 0;
        while (!input.equals("special") && !input.equals("regular")) {
            double price = Double.parseDouble(input);
            if (price > 0) {
                sum += price;
            } else {
                System.out.println("Invalid price!");
            }
            input = sc.nextLine();
        }
        if (sum == 0) {
            System.out.println("Invalid order!");
        } else if (input.equals("special")) {
            double sumPlusTax = sum * 1.2;
            System.out.printf("Congratulations you've just bought a new computer!%n" +
                    "Price without taxes: %.2f$%n" +
                    "Taxes: %.2f$%n" +
                    "-----------%n" +
                    "Total price: %.2f$%n", sum, (sum * 0.2), sumPlusTax * 0.9);
        } else {
            System.out.printf("Congratulations you've just bought a new computer!%n" +
                    "Price without taxes: %.2f$%n" +
                    "Taxes: %.2f$%n" +
                    "-----------%n" +
                    "Total price: %.2f$%n", sum, (sum * 0.2), (sum * 1.2));
        }
    }
}
