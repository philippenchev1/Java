package MidExamPractice_06;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Man_O_War {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> pirateShip = Arrays
                .stream(sc.nextLine()
                        .split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> warShip = Arrays
                .stream(sc.nextLine()
                        .split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int status = Integer.parseInt(sc.nextLine());

        String input = sc.nextLine();

        while (!input.equals("Retire")) {
            List<String> actions = Arrays
                    .stream(input
                            .split(" "))
                    .collect(Collectors.toList());
            String action = actions.get(0);

            switch (action) {
                case "Fire":
                    int fireIndex = Integer.parseInt(actions.get(1));
                    int fireDamage = Integer.parseInt(actions.get(2));
                    if (fireIndex >= 0 && fireIndex < warShip.size()) {
                        int ship = warShip.get(fireIndex);
                        if (ship - fireDamage <= 0) {
                            System.out.println("You won! The enemy ship has sunken.");
                            return;
                        } else {
                            warShip.set(fireIndex, ship - fireDamage);
                        }
                    }
                    break;
                case "Defend":
                    int startIndex = Integer.parseInt(actions.get(1));
                    int endIndex = Integer.parseInt(actions.get(2));
                    int defendDamage = Integer.parseInt(actions.get(3));
                    if (startIndex >= 0 && startIndex < pirateShip.size()
                            && endIndex >= 0 && endIndex < pirateShip.size()
                            && defendDamage >= 0) {
                        for (int i = startIndex; i <= endIndex; i++) {
                            int ship = Integer.parseInt(String.valueOf(pirateShip.get(i)));
                            if (ship - defendDamage <= 0) {
                                System.out.println("You lost! The pirate ship has sunken.");
                                return;
                            } else {
                                pirateShip.set(i, ship - defendDamage);
                            }
                        }
                    }
                    break;
                case "Repair":
                    int repairIndex = Integer.parseInt(actions.get(1));
                    int health = Integer.parseInt(actions.get(2));
                    if (repairIndex >= 0 && repairIndex < pirateShip.size() && health >= 0) {
                        int ship = pirateShip.get(repairIndex);
                        if (health + ship > status) {
                            ship = status;
                            pirateShip.set(repairIndex, ship);
                        } else {
                            pirateShip.set(repairIndex, ship + health);
                        }
                    }
                    break;
                case "Status":
                    int count = 0;
                    for (int i = 0; i < pirateShip.size(); i++) {
                        int section = Integer.parseInt(String.valueOf(pirateShip.get(i)));
                        double currentStatus = ((1.0 * section) / status) * 100;
                        if (currentStatus < 20) {
                            count++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n", count);
                    break;
            }

            input = sc.nextLine();
        }
        int pirateSum = 0;
        int warSum = 0;
        for (int pirate : pirateShip) {
            pirateSum += pirate;
        }
        for (int war : warShip) {
            warSum += war;
        }
        System.out.printf("Pirate ship status: %d%nWarship status: %d", pirateSum, warSum);
    }
}

