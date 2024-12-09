package ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class P01_RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] words = scanner.nextLine().split("\\s+");

        Random rnd = new Random();
        for (int pos1 = 0; pos1 < words.length; pos1++) {
            int indexX = rnd.nextInt(words.length);
            int indexY = rnd.nextInt(words.length);

            String oldWordX = words[indexX];
            words[indexX] = words[indexY];
            words[indexY] = oldWordX;
        }

        System.out.println(String.join(System.lineSeparator(), words));
    }
}
