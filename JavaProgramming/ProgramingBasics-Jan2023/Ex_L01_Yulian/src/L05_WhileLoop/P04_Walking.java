package L05_WhileLoop;

import java.util.Scanner;

public class P04_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int countSteps = 0;

        while (!command.equals("Going home")){
            int currentSteps = Integer.parseInt(command);

            countSteps += currentSteps;

            if (countSteps>= 10000){
                break;
            }
            command = scanner.nextLine();

        }

        if (command.equals("Going home")){
            int stepsToHome = Integer.parseInt(scanner.nextLine());
            countSteps += stepsToHome;
        }

        if (countSteps < 10000){
            System.out.printf("%d more steps to reach goal.",10000-countSteps);
        }else {
            System.out.printf("Goal reached! Good job!%n");
            System.out.printf("%d steps over the goal!",countSteps - 10000);
        }

    }
}
