package L01_Exercises;

import java.util.Scanner;

public class P09_FishTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lenght = Integer.parseInt(scanner.nextLine());
        int weight = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double pertcentFillSpace = Double.parseDouble(scanner.nextLine());

        double volumeInLitres = (lenght* weight * height) * 0.001;

        double neededLitres = volumeInLitres * (1-pertcentFillSpace / 100);
        System.out.println(neededLitres);












    }
}
