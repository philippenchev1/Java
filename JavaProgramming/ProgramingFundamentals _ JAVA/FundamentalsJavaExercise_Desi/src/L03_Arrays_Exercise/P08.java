package L03_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //8.	Magic Sum
        //Write a program that prints all unique pairs in an array of integers whose sum is equal to a given number.

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int targetSum = Integer.parseInt(scanner.nextLine());


        for (int index = 0; index < numbers.length; index++) {
            int currentNumber = numbers[index];
            for (int i = index + 1; i < numbers.length; i++) {
                int nextNumber = numbers[i];

                if (currentNumber + nextNumber == targetSum) {
                    System.out.println(currentNumber + " " + nextNumber);
                }
            }
        }
    }
}
