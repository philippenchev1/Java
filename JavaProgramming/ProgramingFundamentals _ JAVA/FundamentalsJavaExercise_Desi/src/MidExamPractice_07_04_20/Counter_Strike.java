package MidExamPractice_07_04_20;

import java.util.Scanner;

public class Counter_Strike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());
        int energy = initialEnergy;
        String command = scanner.nextLine();
        int countWins = 0;
        boolean enoughEnergy = true;

        while (!command.equals("End of battle")) {
            int distance = Integer.parseInt(command);

            if ((energy - distance) < 0) {
                enoughEnergy = false;
                break;
            } else {
                energy -= distance;
                countWins++;
                if (countWins % 3 == 0) {
                    energy += countWins;
                }
            }


            command = scanner.nextLine();
        }
        if (enoughEnergy) {
            System.out.printf("Won battles: %d. Energy left: %d%n", countWins, energy);
        } else {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy%n", countWins, energy);
        }

    }
}
