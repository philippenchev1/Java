package TestExams_20_21_April2019;

import java.util.Scanner;

public class P04_EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingEggs = Integer.parseInt(scanner.nextLine());
        int eggsAvailable = startingEggs;

        String input = scanner.nextLine();
        int eggsBuy = 0;
        boolean notEnough = false;

        while (!input.equals("Close")){
            String command = input;
            int eggsBuyOrFill = Integer.parseInt(scanner.nextLine());

            switch (command){
                case "Buy":
                    eggsAvailable -= eggsBuyOrFill;
                    if (eggsAvailable < 0){
                        notEnough = true;
                        eggsBuyOrFill -= Math.abs(eggsAvailable);
                    }
                    eggsBuy += eggsBuyOrFill;
                    break;

                case "Fill":
                    eggsAvailable += eggsBuyOrFill;
                    break;
            }
            if (notEnough){
                System.out.printf("Not enough eggs in store!%nYou can buy only %d.",eggsBuyOrFill);
                break;
            }
            input = scanner.nextLine();

        }
        if ("Close".equals(input)){
            System.out.printf("Store is closed!%n%d eggs sold.",eggsBuy);
        }


    }
}
