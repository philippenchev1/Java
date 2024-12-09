package L02_DataTypes_Variables_Exercise;

import java.util.Scanner;

public class P07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberLines = Integer.parseInt(scanner.nextLine());

        int sumLitters = 0;
        int capacity = 255;

        for (int i = 1; i <= numberLines; i++) {
            int currentLitters = Integer.parseInt(scanner.nextLine());
            sumLitters += currentLitters;

            if (sumLitters > capacity) {
                System.out.println("Insufficient capacity!");
                sumLitters -= currentLitters;
            }

        }

        System.out.println(sumLitters);


    }
}
