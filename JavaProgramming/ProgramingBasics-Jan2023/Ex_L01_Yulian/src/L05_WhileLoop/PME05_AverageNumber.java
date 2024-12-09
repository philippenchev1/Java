package L05_WhileLoop;

import java.util.Scanner;

public class PME05_AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= number ; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum += currentNumber;

        }

        System.out.printf("%.2f",(sum * 1.0 / number ));
    }
}
