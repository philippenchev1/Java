package While_Loop;

import java.util.Scanner;

public class P03_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sumNumber = 0;

        while (sumNumber<number){
            int currentNum = Integer.parseInt(scanner.nextLine());
            sumNumber += currentNum;
        }

        System.out.println(sumNumber);
    }
}
