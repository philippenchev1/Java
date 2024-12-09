package PRACTICE;

import java.util.Scanner;

public class PP03_Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int validCombinations = 0;

        for (int x1 = 0; x1 <= n ; x1++) {
            for (int x2 = 0; x2 <= 25 ; x2++) {
                for (int x3 = 0; x3 <= 25 ; x3++) {

                    if (x1+x2+x3 == n){
                        validCombinations++;
                    }

                }

            }

        }

        System.out.printf("%d",validCombinations);
    }
}
