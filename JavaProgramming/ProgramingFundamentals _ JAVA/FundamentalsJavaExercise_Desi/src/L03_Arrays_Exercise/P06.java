package L03_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        //6.	Equal Sums
        //Write a program that determines if an element exists in the array such that the sum of the elements on its
        // left is equal to the sum of the elements on its right.
        // If there are no elements to the left/right, their sum is considered to be 0.
        // Print the index that satisfies the required condition or "no" if there is no such index.

        int [] numbers = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        for (int index = 0; index < numbers.length; index++) {
            int currentElement = numbers[index];

            int leftSum = 0;
            int rightSum = 0;

            for (int leftIndex = 0; leftIndex < index ; leftIndex++) {
                leftSum += numbers[leftIndex];
            }
            for (int rightIndex = index + 1; rightIndex < numbers.length; rightIndex++) {
                rightSum += numbers[rightIndex];
            }
            if (leftSum == rightSum){
                System.out.println(index);
                return;
            }

        }
        System.out.println("no");


    }
}

