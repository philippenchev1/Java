package L04_ForCycle;

import java.util.Scanner;

public class MEP08_EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int firstSum = 0;
        int secondSum = 0;
        int diff = 0;

        boolean check = true;

        for (int i = 1; i <= n ; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());

            if (i % 2 != 0){
                firstSum = num1+num2;
            }else {
                secondSum = num1+num2;
            }

            if (firstSum == secondSum || n < 2){
                check = true;
            }else {
                diff = Math.abs(secondSum-firstSum);
                check = false;
            }

        }

        if (check){
            System.out.printf("Yes, value=%d",firstSum);
        }else {
            System.out.printf("No, maxdiff=%d",diff);
        }
    }
}
