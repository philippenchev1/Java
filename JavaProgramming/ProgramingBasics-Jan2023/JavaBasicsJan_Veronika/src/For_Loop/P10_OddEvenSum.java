package For_Loop;

import java.util.Scanner;

public class P10_OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <=n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0){
                evenSum += currentNum;
            }else {
                oddSum += currentNum;
            }

        }
        if (evenSum==oddSum){
            System.out.printf("Yes%n");
            System.out.printf("Sum = %d",oddSum);
        }else {
            int diff = Math.abs(oddSum-evenSum);
            System.out.printf("No%n");
            System.out.printf("Diff = %d",diff);
        }
    }
}
