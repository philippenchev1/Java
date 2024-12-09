package TestExams_6_7_July2019;

import java.util.Scanner;

public class P01_PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPeople = Integer.parseInt(scanner.nextLine());
        double entryTax = Double.parseDouble(scanner.nextLine());
        double priceLounger = Double.parseDouble(scanner.nextLine());
        double priceUmbrella = Double.parseDouble(scanner.nextLine());

        double totalSUm = (numPeople * entryTax) + (Math.ceil(numPeople * 0.75) * priceLounger) + ((Math.ceil(numPeople*0.5))*priceUmbrella);

        System.out.printf("%.2f lv.",totalSUm);




    }
}
