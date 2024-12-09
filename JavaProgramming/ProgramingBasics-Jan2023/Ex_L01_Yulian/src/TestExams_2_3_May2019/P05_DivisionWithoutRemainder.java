package TestExams_2_3_May2019;

import java.util.Scanner;

public class P05_DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int countBy2 = 0;
        int countBy3 = 0;
        int countBy4 = 0;


        for (int i = 1; i <= n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            if (currentNum % 2 == 0){
                countBy2++;
            }

            if (currentNum % 3 == 0) {
                countBy3++;

            }
            if (currentNum % 4 == 0) {
                countBy4++;
            }

        }

        double percentBy2 = countBy2 * 1.0 / n * 100;
        double percentBy3 = countBy3 * 1.0 / n * 100;
        double percentBy4 = countBy4 * 1.0 / n * 100;

        System.out.printf("%.2f%%%n",percentBy2);
        System.out.printf("%.2f%%%n",percentBy3);
        System.out.printf("%.2f%%%n",percentBy4);


    }
}
