package L01_SyntaxConditionalStatementsLoopsExercise;

import java.util.Scanner;

public class P09_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        double total = 0;

        for (int i = 1; i <= N ; i++) {
            double capsulePrice = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());

            double orderPrice = capsulePrice * days * capsuleCount;
            total += orderPrice;

            System.out.printf("The price for the coffee is: $%.2f%n",orderPrice);
            


        }

        System.out.printf("Total: $%.2f",total);
    }
}
