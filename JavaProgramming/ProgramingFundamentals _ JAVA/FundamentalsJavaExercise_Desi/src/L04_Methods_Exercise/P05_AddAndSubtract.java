package L04_Methods_Exercise;

import java.util.Scanner;

public class P05_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        int sumOfNumbers = sumIntegers(number1,number2);
        int subtractOfNumbers = subtract(sumOfNumbers,number3);

        System.out.println(subtractOfNumbers);

    }

    public static int sumIntegers (int number1, int number2){
        return number1 + number2;
    }
    public static int subtract (int num1, int num2){
        return num1 - num2;
    }
}
