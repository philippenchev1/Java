package L03_Arrays_Exercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class PME02_PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //2.	Pascal Triangle
        //The triangle may be constructed in the following manner: In row 0 (the topmost row),
        //there is a unique nonzero entry
        // 1. Each entry of each subsequent row is constructed by adding the number above and to the left with the number above and to the right,
        // treating blank entries as 0. For example, the initial number in the first (or any other) row is 1 (the sum of 0 and 1),
        // whereas the numbers 1 and 3 in the third row are added to produce the number 4 in the fourth row.
        //If you want more info about it: https://en.wikipedia.org/wiki/Pascal's_triangle
        //Print each row element, separated with whitespace.


        int n = Integer.parseInt(scanner.nextLine());

        BigDecimal[] numberArr = new BigDecimal[1];
        numberArr[0] = BigDecimal.valueOf(1);
        System.out.println(1 + " ");
        for (int i = 1; i < n; i++) {
            BigDecimal[] tempArray = new BigDecimal[i + 1];
            tempArray[0] = BigDecimal.valueOf(1);
            for (int j = 1; j < tempArray.length; j++) {
                if (j < tempArray.length - 1) {
                    BigDecimal sum = new BigDecimal("0");
                    sum = sum.add(numberArr[j - 1]).add(numberArr[j]);
                    tempArray[j] = sum;
                } else {
                    tempArray[j] = BigDecimal.valueOf(1);
                }
            }
            for (BigDecimal item : tempArray
            ) {
                System.out.printf("%.0f ", item);
            }
            System.out.println();
            numberArr = tempArray;
        }
    }
}


