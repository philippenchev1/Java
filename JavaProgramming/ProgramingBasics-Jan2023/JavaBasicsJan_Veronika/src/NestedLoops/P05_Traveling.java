package NestedLoops;

import java.util.Scanner;

public class P05_Traveling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("End")){
            String destination = command;
            double tripPrice = Double.parseDouble(scanner.nextLine());

            double currentSum = 0;

            while (currentSum < tripPrice){
                double amount = Double.parseDouble(scanner.nextLine());
                currentSum += amount;
            }
            System.out.printf("Going to %s!%n",destination);

            command =scanner.nextLine();
        }


    }
}
