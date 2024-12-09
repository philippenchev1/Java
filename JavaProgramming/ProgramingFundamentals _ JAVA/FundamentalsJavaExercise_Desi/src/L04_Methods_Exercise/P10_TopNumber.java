package L04_Methods_Exercise;

import java.util.Scanner;

public class P10_TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n ; number++) {
            boolean isSum = isSumOfDigitsDivisibleBy8(number);
            boolean isContains = isContainsOddDigit(number);
            if (isSum && isContains){
                System.out.println(number);
            }

        }

    }
    public static boolean isSumOfDigitsDivisibleBy8 (int n){
        int sum = 0;
        while (n > 0){
            int lastNumber = n % 10;
            sum += lastNumber;
            n = n / 10;
        }
        return sum % 8 == 0;
    }

    public static boolean isContainsOddDigit (int n){
        while (n > 0){
            int lastDigit = n % 10;
            if (lastDigit % 2 != 0){
                return true;
            }else {
                n /= 10;
            }
        }
        return false;
    }
}
