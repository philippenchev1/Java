package MidExamPractice_05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> rooms = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        int health = 100;
        int bitcoins = 0;
        String monsterWin = "";
        int bestRoom = 0;

        String input = "";
        for (String room : rooms) {
            input = room;
            List<String> actions = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String action = actions.get(0);
            bestRoom++;
            if (action.equals("potion")) {
                int healthPotion = Integer.parseInt(actions.get(1));
                if (health + healthPotion <= 100) {
                    health += healthPotion;
                    System.out.printf("You healed for %d hp.%n", healthPotion);
                    System.out.printf("Current health: %d hp.%n", health);
                } else if (health + healthPotion > 100) {
                    int currentHealth = 100 - health;
                    System.out.printf("You healed for %d hp.%n", currentHealth);
                    health = 100;
                    System.out.printf("Current health: %d hp.%n", health);
                }
            }
            if (action.equals("chest")) {
                int foundBitcoin = Integer.parseInt(actions.get(1));
                bitcoins += foundBitcoin;
                System.out.printf("You found %d bitcoins.%n", foundBitcoin);
            }
            if (!action.equals("potion") && !action.equals("chest")) {
                String monster = actions.get(0);
                monsterWin = monster;
                health -= Integer.parseInt(actions.get(1));
                if (health <= 0) {
                    System.out.printf("You died! Killed by %s.%n", monsterWin);
                    System.out.printf("Best room: %d", bestRoom);
                    return;
                }
                System.out.printf("You slayed %s.%n", monsterWin);
            }
        }
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n", bitcoins);
        System.out.printf("Health: %d%n", health);
    }
}
