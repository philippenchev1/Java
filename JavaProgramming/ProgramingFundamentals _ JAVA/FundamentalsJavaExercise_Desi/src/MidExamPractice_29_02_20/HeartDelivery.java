package MidExamPractice_29_02_20;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> neighborhoodList = Arrays.stream(scanner.nextLine().split("\\@"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        int position = 0;
        int count = 0;

        while (!input.equals("Love!")) {
            List<String> jumpCommand = Arrays.stream(input.split(" "))
                    .collect(Collectors.toList());

            if (jumpCommand.get(0).equals("Jump")) {
                position += Integer.parseInt(jumpCommand.get(1));
            }
            if (position > neighborhoodList.size() - 1) {
                position = 0;
            }
            if (neighborhoodList.get(position) == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", position);
            } else {
                int currentElement = neighborhoodList.get(position);
                neighborhoodList.set(position, currentElement - 2);
                if (neighborhoodList.get(position) == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", position);
                }
            }
            input = scanner.nextLine();
        }

        System.out.printf("Cupid's last position was %d.%n", position);

        for (Integer element : neighborhoodList) {
            if (element != 0) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", count);
        }

    }
}
