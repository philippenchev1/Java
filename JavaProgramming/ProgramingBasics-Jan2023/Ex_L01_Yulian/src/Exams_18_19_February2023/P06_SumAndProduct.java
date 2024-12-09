package Exams_18_19_February2023;

import java.util.Scanner;

public class P06_SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int n = Integer.parseInt(scanner.nextLine());
        boolean valid = false;
        boolean valid1 = false;


        for (int a = 1; a <= 9; a++) {
            for (int b = 9; b >= a; b--) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 9; d >= c; d--) {
                        int sum = a + b + c + d;
                        int product = a * b * c * d;

                        if (sum == product && n % 10 == 5) {
                            valid = true;
                            System.out.println(a * 1000 + b * 100 + c * 10 + d);

                            return;
                        } else if (product / sum == 3 && n % 3 == 0) {
                            valid1 = true;
                            System.out.println(d * 1000 + c * 100 + b * 10 + a);
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("Nothing found");
    }
}
