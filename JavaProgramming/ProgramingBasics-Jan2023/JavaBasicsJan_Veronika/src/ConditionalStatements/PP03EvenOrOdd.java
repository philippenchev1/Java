package ConditionalStatements;

import java.util.Scanner;

public class PP03EvenOrOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (number % 2 == 0) {
            System.out.printf("even");
        }else {
            System.out.printf("odd");
        }
    }
}
