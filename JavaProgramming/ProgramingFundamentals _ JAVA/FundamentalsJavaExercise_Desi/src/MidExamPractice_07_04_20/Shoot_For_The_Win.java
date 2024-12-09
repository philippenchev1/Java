package MidExamPractice_07_04_20;

import java.util.Arrays;
import java.util.Scanner;

public class Shoot_For_The_Win {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] targets = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        String input = scanner.nextLine();
        int shoot = 0;
        while (!input.equals("End")) {
            int index = Integer.parseInt(input);
            if (index >= targets.length) {

                input = scanner.nextLine();
                continue;
            }
            if (index < 0) {
                input = scanner.nextLine();
                continue;
            }
            if (targets[index] == -1) {
                input = scanner.nextLine();
                continue;
            }
            int oldValue = targets[index];
            targets[index] = -1;
            shoot++;
            for (int i = 0; i <= targets.length - 1; i++) {
                if (targets[i] == -1) {
                    continue;
                }
                if (oldValue < targets[i]) {
                    int newValue = targets[i] - oldValue;
                    targets[i] = newValue;
                } else if (oldValue >= targets[i] && targets[i] != -1) {
                    int newValue = targets[i] + oldValue;
                    targets[i] = newValue;
                }

            }
            input = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d ->", shoot);
        System.out.print(Arrays.toString(targets).replace("[", " ").replace("]", " ")
                .replace(",", ""));
    }
}

