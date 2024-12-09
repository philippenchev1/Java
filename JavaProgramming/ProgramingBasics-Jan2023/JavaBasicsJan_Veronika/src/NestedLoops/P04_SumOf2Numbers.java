package NestedLoops;

import java.util.Scanner;

public class P04_SumOf2Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int lastNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        boolean isValid = false;
        int count = 0;

        for (int i = firstNum; i <= lastNum ; i++) {
            for (int j = firstNum; j <= lastNum ; j++) {
                count++;
                int sum = i + j;

                if (sum == magicNum){
                    isValid = true;
                    System.out.printf("Combination N:%d ",count);
                    System.out.printf("(%d + %d = %d)%n",i,j,sum);
                    break;
                }
            }
            if (isValid){
                break;
            }

        }
        if (!isValid){
            System.out.printf("%d combinations - neither equals %d%n",count,magicNum);
        }

    }
}
