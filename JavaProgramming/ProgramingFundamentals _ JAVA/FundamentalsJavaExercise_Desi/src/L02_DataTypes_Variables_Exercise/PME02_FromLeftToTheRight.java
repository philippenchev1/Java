package L02_DataTypes_Variables_Exercise;

import java.util.Scanner;

public class PME02_FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;


        for (int i = 1; i <= n; i++) {
            long firstNum = scan.nextLong();
            long secondNum = scan.nextLong();
            if (firstNum > secondNum) {
                while (firstNum != 0) {
                    long currentDigit = firstNum % 10;
                    sum += currentDigit;
                    firstNum /= 10;
                }
            } else {
                while (secondNum != 0) {
                    long currentDigit = secondNum % 10;
                    sum += currentDigit;
                    secondNum /= 10;
                }
            }
            System.out.println(Math.abs(sum));
            sum = 0;


        }
    }
}