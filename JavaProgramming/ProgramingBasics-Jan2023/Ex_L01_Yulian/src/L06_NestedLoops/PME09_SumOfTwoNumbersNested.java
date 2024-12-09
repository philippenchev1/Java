package L06_NestedLoops;

import java.util.Scanner;

public class PME09_SumOfTwoNumbersNested {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int combinationCounter = 0;
        boolean isValid = false;


        for (int i = a; i <= b ; i++) {
            for (int j = a; j <= b ; j++) {
                combinationCounter++;
                int sum = i+j;
                if (sum == magicNumber){
                    isValid = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)",combinationCounter,i,j,magicNumber);
                    break;

                }

            }
            if (isValid){
                break;
            }

        }
        if (!isValid){
            System.out.printf("%d combinations - neither equals %d%n",combinationCounter,magicNumber);
        }

    }
}
