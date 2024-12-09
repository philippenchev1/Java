package TestExams_28_29_March2020;

import javax.imageio.ImageTranscoder;
import java.util.Scanner;

public class P05_CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodKg = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int totalFood = 0;

        while (!command.equals("Adopted")){
            int eatenFood = Integer.parseInt(command);
            totalFood += eatenFood;


            command = scanner.nextLine();
        }

        if (totalFood > (foodKg * 1000)){
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs((foodKg*1000)-totalFood));
        }else {
            System.out.printf("Food is enough! Leftovers: %d grams.",(foodKg*1000)-totalFood);

        }




    }
}
