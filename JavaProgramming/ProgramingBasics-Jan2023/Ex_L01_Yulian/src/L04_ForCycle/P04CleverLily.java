package L04_ForCycle;

import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washMachinePrice = Double.parseDouble(scanner.nextLine());
        int pricePerToy = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        int toyCount = 0;
        double moneyEvenAge = 10;


        for (int currentAge = 1; currentAge <= age ; currentAge++) {
            if (currentAge % 2 == 0) {
                sum += moneyEvenAge;
                moneyEvenAge += 10;
                sum--;
            }else {
                toyCount++;

            }

        }

        sum += toyCount * pricePerToy;

        double diff = Math.abs(sum- washMachinePrice);

        if (sum >= washMachinePrice){
            System.out.printf("Yes! %.2f",diff );
        }else {
            System.out.printf("No! %.2f", diff);

        }

    }
}
