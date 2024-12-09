package PRACTICE;

import java.util.Scanner;

public class PE02_EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        for (int i = first; i <= second ; i++) {
            int firstDigit = i / 100000;
            int secondDigit = i / 10000 % 10;
            int thirdDigit = i / 1000 % 10;
            int fourthDigit = i / 100 % 10;
            int fifthDigit = i / 10 % 10;
            int sixthDigit = i % 10;

            int evenSum = secondDigit + fourthDigit + sixthDigit;
            int oddSum = firstDigit + thirdDigit + fifthDigit;

            if (evenSum == oddSum){
                System.out.printf("%d ",i);
            }


        }
    }
}
