package L03_Arrays_Exercise;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //5.	Top Integers
        //Write a program to find all the top integers in an array.
        //A top integer is an integer that is bigger than all the elements to its right.

        int [] numbers = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];

            if (i == numbers.length - 1){
                System.out.println(currentNumber + " ");
                break;
            }
            boolean isTop = false;
            for (int j = i + 1; j < numbers.length; j++) {
                int nextNumber = numbers[j];
                if (currentNumber > nextNumber){
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }
            }
            if (isTop){
                System.out.print(currentNumber + " ");
            }
        }


    }
}
