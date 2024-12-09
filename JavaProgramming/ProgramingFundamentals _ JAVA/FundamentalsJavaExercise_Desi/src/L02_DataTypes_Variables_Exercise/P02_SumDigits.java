package L02_DataTypes_Variables_Exercise;

import java.util.Scanner;

public class P02_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (n > 0){
            int currentDigit = n % 10;
            sum += currentDigit;
            n = n / 10;
        }

        System.out.println(sum);
    }
}
