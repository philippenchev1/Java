package DataTypes_Variables;

import java.util.Scanner;

public class P02_PoundToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bgp = Double.parseDouble(scanner.nextLine());

        double usd = bgp * 1.36;

        System.out.printf("%.3f",usd);

    }
}
