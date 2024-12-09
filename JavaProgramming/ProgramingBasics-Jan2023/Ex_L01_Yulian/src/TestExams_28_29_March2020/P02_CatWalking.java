package TestExams_28_29_March2020;

import java.util.Scanner;

public class P02_CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesWalking = Integer.parseInt(scanner.nextLine());
        int countWalking = Integer.parseInt(scanner.nextLine());
        int consumeCalories = Integer.parseInt(scanner.nextLine());

        int burnedCalories = minutesWalking * countWalking * 5;

        if (burnedCalories >= consumeCalories * 0.5){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.",burnedCalories);
        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.",burnedCalories);
        }

    }
}
