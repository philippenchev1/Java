package L03_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class PP08_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int magicSum = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < numbers.length; i++) {
            int firstNUmber = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                int nextNumber = numbers[j];

                if (firstNUmber + nextNumber == magicSum){
                    System.out.println(firstNUmber + " " + nextNumber);
                }
            }
        }


    }
}
