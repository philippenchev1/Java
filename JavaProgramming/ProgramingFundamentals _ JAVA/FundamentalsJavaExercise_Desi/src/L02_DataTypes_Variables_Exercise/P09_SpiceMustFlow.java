package L02_DataTypes_Variables_Exercise;

import java.util.Scanner;

public class P09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int source = Integer.parseInt(scanner.nextLine());
        int totalAmountSpices = 0;

        int days = 0;


        while (source >= 100) {
            int spices = source - 26;
            totalAmountSpices += spices;
            days++;
            source -= 10;

        }

        System.out.println(days);
        if (totalAmountSpices >= 26) {
            totalAmountSpices -= 26;
        }

        System.out.println(totalAmountSpices);


    }
}
