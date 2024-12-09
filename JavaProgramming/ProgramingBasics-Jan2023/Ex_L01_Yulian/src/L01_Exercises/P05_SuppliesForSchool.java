package L01_Exercises;

import java.util.Scanner;

public class P05_SuppliesForSchool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int penPackages = Integer.parseInt(scanner.nextLine());
        int highlightersPackages = Integer.parseInt(scanner.nextLine());
        int cleaningAgentPackages = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double priceForPenPackages = penPackages * 5.80;
        double priceForHighlighters = highlightersPackages * 7.20;
        double priceCleaningAgent = cleaningAgentPackages *  1.20;

        double sumWithoutDiscount = priceForHighlighters + priceCleaningAgent + priceForPenPackages;

        double discount = sumWithoutDiscount * (percentDiscount / 100.0);

        double finalSum = sumWithoutDiscount - discount;

        System.out.println(finalSum);





    }
}
