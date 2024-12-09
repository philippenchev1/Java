package L03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class MEP06_TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kilometersPerMonth = Double.parseDouble(scanner.nextLine());

        double salary = 0;

        switch (season){
            case "Spring":
            case "Autumn":
                if(kilometersPerMonth <= 5000){
                    salary = kilometersPerMonth * 0.75 * 4 * 0.9;
                } else if (kilometersPerMonth <= 10000) {
                    salary = kilometersPerMonth * 0.95 * 4 * 0.9;

                } else if (kilometersPerMonth <= 20000) {
                    salary = kilometersPerMonth * 1.45 * 4 * 0.9;
                }

                break;
            case "Summer":
                if(kilometersPerMonth <= 5000){
                    salary = kilometersPerMonth * 0.90 * 4 * 0.9;
                } else if (kilometersPerMonth <= 10000) {
                    salary = kilometersPerMonth * 1.10 * 4 * 0.9;

                } else if (kilometersPerMonth <= 20000) {
                    salary = kilometersPerMonth * 1.45 * 4 * 0.9;
                }
                break;

            case "Winter":
                if(kilometersPerMonth <= 5000){
                    salary = kilometersPerMonth * 1.05 * 4 * 0.9;
                } else if (kilometersPerMonth <= 10000) {
                    salary = kilometersPerMonth * 1.25 * 4 * 0.9;

                } else if (kilometersPerMonth <= 20000) {
                    salary = kilometersPerMonth * 1.45 * 4 * 0.9;
                }
                break;

        }

        System.out.printf("%.2f",salary);

    }

}
