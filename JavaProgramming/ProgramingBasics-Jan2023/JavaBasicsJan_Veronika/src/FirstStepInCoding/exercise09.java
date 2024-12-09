package FirstStepInCoding;

import java.util.Scanner;

public class exercise09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sqM = Double.parseDouble(scanner.nextLine());

        double price = sqM * 7.61;
        double discount = price * 0.18;

        double finalPrice = price - discount;

        System.out.println("The final price is : " + finalPrice + " Lv.");
        System.out.println("The discount is : " + discount + " Lv.");

    }
}
