package L05_WhileLoop;

import java.util.Scanner;

public class PME01_Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottlesDetergent = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int detergentMilliliters = bottlesDetergent * 750;


        int washingCounter = 0;

        int cleanDishes = 0;
        int cleanPots = 0;

        while (!command.equals("End")){
            int washings = Integer.parseInt(command);
            washingCounter++;

            if (washingCounter % 3 == 0){
                cleanPots += washings;
                detergentMilliliters -= washings * 15;
            }else {
                cleanDishes += washings;
                detergentMilliliters -= washings * 5;
            }

            if (detergentMilliliters<0){
                break;
            }

            command = scanner.nextLine();
        }

            if (detergentMilliliters < 0){
                System.out.printf("Not enough detergent, %d ml. more necessary!%n",Math.abs(detergentMilliliters));

            }else {
                System.out.printf("Detergent was enough!%n");
                System.out.printf("%d dishes and %d pots were washed.%n",cleanDishes,cleanPots);
                System.out.printf("Leftover detergent %d ml.",detergentMilliliters);

            }

    }
}
