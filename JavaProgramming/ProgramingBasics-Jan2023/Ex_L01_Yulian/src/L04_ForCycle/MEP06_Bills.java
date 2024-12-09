package L04_ForCycle;

import java.util.Scanner;

public class MEP06_Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int monts = Integer.parseInt(scanner.nextLine());


        double waterPrice = 0;
        double internetPrice = 0;
        double other = 0;
        double sumelectricityPrice = 0;


        for (int i = 1; i <= monts ; i++) {
            double electricityPrice = Double.parseDouble(scanner.nextLine());
            sumelectricityPrice += electricityPrice;
            waterPrice += 20;
            internetPrice += 15;
            other += (electricityPrice+20+15)*1.2;



        }
        double averageprice = (sumelectricityPrice+waterPrice+internetPrice+other)/monts;


        System.out.printf("Electricity: %.2f lv%n",sumelectricityPrice);
        System.out.printf("Water: %.2f lv%n",waterPrice);
        System.out.printf("Internet: %.2f lv%n",internetPrice);
        System.out.printf("Other: %.2f lv%n",other);
        System.out.printf("Average: %.2f lv",averageprice);
    }
}
