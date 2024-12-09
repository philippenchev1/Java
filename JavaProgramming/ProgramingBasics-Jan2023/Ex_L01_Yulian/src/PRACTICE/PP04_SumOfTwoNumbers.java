package PRACTICE;

import java.util.Scanner;

public class PP04_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        boolean isValid = false;
        int combinationCounter = 0;

        for (int i = start; i <= end ; i++) {
            for (int j = start; j <= end ; j++) {
                combinationCounter++;
                int sum = i + j;

                if (sum == magicNum){
                    isValid = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)",combinationCounter,i,j,magicNum);
                    break;
                }

            }
            if (isValid){
                break;
            }

        }
        if (!isValid){
            System.out.printf("%d combinations - neither equals %d%n",combinationCounter,magicNum);
        }



    }
}
