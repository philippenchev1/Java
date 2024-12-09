package PRACTICE;

import java.util.Scanner;

public class PE03_SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int primeSum = 0;
        int nonPrimeSum = 0;


        while (!command.equals("stop")){
            int currentNum = Integer.parseInt(command);
            boolean isPrime = true;

            if (currentNum < 0){
                System.out.printf("Number is negative.%n");
                command = scanner.nextLine();
                continue;
            }

            for (int current = 2; current < currentNum  ; current++) {
                if ( currentNum % current == 0){
                    isPrime = false;
                    nonPrimeSum += currentNum;
                    break;
                }

            }
            if (isPrime){
                primeSum += currentNum;
            }

                command = scanner.nextLine();
        }
        System.out.printf("Sum of all prime number is: %d%n",primeSum);
        System.out.printf("Sum of all non prime number is: %d%n",nonPrimeSum);

    }
}
