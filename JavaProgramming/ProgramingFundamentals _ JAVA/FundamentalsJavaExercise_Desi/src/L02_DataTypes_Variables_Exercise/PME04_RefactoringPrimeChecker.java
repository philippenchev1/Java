package L02_DataTypes_Variables_Exercise;

import java.util.Scanner;

public class PME04_RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isPrime);
        }
    }
}


