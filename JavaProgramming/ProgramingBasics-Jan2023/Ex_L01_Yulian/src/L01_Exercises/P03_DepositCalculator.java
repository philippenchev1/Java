package L01_Exercises;

import java.util.Scanner;

public class P03_DepositCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());

        int monts = Integer.parseInt(scanner.nextLine());

        double percentPerYear = Double.parseDouble(scanner.nextLine());

        double  amountPerMOnth = (deposit * (percentPerYear / 100)) / 12;

        double totalSum = deposit + amountPerMOnth * monts;

        System.out.println(totalSum);





    }
}
