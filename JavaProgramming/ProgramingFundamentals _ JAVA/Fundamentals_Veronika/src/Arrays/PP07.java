package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PP07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //7.	Condense Array to Number
        //Write a program to read an array of integers and condense them by summing adjacent couples of elements
        // until a single integer is obtained.
        // For example, if we have 3 elements {2, 10, 3},
        // we sum the first two and the second two elements and obtain {2+10, 10+3} = {12, 13},
        // then we sum again all adjacent elements and obtain {12+13} = {25}.

        int [] numbers = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int [] condensed = new int[numbers.length - 1];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers.length == 1){
                break;
            }
            if (i == numbers.length - 1){
                int[] condensedNew = new int[condensed.length - 1];
                i = -1;
                numbers = condensed;
                condensed = condensedNew;
            } else {
                condensed[i] = numbers[i] + numbers[i + 1];
            }
        }

        System.out.println(numbers[0]);

    }
}
