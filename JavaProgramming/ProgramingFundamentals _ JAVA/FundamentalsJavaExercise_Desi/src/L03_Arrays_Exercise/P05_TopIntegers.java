package L03_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int index = 0; index < numbers.length; index++) {
            int currentNumber = numbers[index];

            if (index == numbers.length - 1) {
                System.out.println(currentNumber + " ");
                break;
            }

            boolean isTop = false;
            for (int i = index + 1; i < numbers.length; i++) {
                int nextNumber = numbers[i];
                if (currentNumber > nextNumber) {
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }
            }

            if (isTop) {
                System.out.print(currentNumber + " ");
            }
        }


    }
}
