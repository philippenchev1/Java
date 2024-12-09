package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PP05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //5.	Even and Odd Subtraction
        //Write a program that calculates the difference between the sum of the even and the sum of the odd numbers in an array.
        // 1 2 3 4 5 6

        int[] numbers = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int evenSum = 0;
        int oddSum = 0;

        for ( int number : numbers) {
            if (number % 2 == 0){
                evenSum += number;
            } else {
                oddSum += number;
            }

        }

        int diff = evenSum - oddSum;

        System.out.println(diff);
    }
}
