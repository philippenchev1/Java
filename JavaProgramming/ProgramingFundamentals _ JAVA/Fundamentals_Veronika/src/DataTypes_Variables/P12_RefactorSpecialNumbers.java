package DataTypes_Variables;

import java.util.Scanner;

public class P12_RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            int currentNumber = i;

            int sum = 0;
            while (currentNumber > 0){
                sum = sum + (currentNumber % 10);
                currentNumber = currentNumber / 10;
            }

            boolean isSpecial = sum == 5 || sum == 7 || sum == 11;

            if (isSpecial){
                System.out.printf("%d -> True%n",i);
            } else {
                System.out.printf("%d -> False%n",i);
            }

        }

    }
}
