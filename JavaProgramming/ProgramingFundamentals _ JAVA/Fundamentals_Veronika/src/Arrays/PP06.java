package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PP06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //6.	Equal Arrays
        //Read two arrays and print on the console whether they are identical or not.
        // Arrays are identical if their elements are equal.
        // If the arrays are identical, find the sum of the first one and print on the console the following message:
        // "Arrays are identical. Sum: {sum}",
        // otherwise find the first index where the arrays differ and print on the console following message:
        // "Arrays are not identical. Found difference at {index} index."

        int[] firstArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] secondArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        int diffIndex = -1;
        boolean isIdentical = true;

        for (int i = 0; i < firstArray.length; i++) {
            int firstNum = firstArray[i];
            int secondNum = secondArray[i];

            if (firstNum == secondNum) {
                sum += firstNum;
            } else {
                isIdentical = false;
                diffIndex = i;
                break;
            }
        }

        if (isIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", diffIndex);
        }


    }
}

