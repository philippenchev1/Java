package L04_Methods_Exercise;

import java.util.Scanner;

public class P08_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        long fact1 = calculateFactorial(firstNumber);
        long fact2 = calculateFactorial(secondNumber);

        double divisionFactorials = fact1 * 1.0 / fact2;
        System.out.printf("%.2f",divisionFactorials);



    }
    public static long calculateFactorial(int number){
        long fact = 1;
        for (int i = 1; i <= number ; i++) {
            fact = fact * i;
        }
        return fact;
    }

}
