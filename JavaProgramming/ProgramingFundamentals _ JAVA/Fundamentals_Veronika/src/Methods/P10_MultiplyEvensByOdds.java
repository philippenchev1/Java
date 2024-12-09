package Methods;

import java.util.Scanner;

public class P10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(getMultipleOfEvensAndOdds(number));


    }

    public static int getMultipleOfEvensAndOdds (int n){
        int evenSum = getEvenSum(n);
        int oddSum = getOddSum(n);
        return evenSum * oddSum;
    }

    public static int getEvenSum (int n){
        int evenSum = 0;
        while (n > 0) {
            int lastNum = n % 10;
            if (lastNum % 2 == 0){
                evenSum += lastNum;
            }
            n = n / 10;
        }
        return evenSum;
    }

    public static int getOddSum (int n){
        int oddSum = 0;
        while (n > 0) {
            int lasNum = n % 10;
            if (lasNum % 2 != 0){
                oddSum += lasNum;
            }
            n = n / 10;

        }
        return oddSum;
    }


}
