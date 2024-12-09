package Exam_Preparation;

import java.util.Scanner;

public class P06_EasterConcourse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int easterBreadCount = Integer.parseInt(scanner.nextLine());

        int maxPoints = Integer.MIN_VALUE;
        String winnerName = "";
        for (int i = 1; i <= easterBreadCount; i++) {
            String name = scanner.nextLine();

            int sumCurrentPoints = 0;
            String input = scanner.nextLine();
            while (!input.equals("Stop")) {
                int currentPoints = Integer.parseInt(input);

                sumCurrentPoints = sumCurrentPoints + currentPoints;

                input = scanner.nextLine();
            }

            System.out.printf("%s has %d points.%n", name, sumCurrentPoints);

            if (sumCurrentPoints > maxPoints) {
                maxPoints = sumCurrentPoints;
                System.out.printf("%s is the new number 1!%n", name);
                winnerName = name;
            }
        }

        System.out.printf("%s won competition with %d points!%n", winnerName, maxPoints);
    }
}
    