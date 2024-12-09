package L06_NestedLoops;

import java.util.Scanner;

public class PME01_UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= x1 ; i+=2) {
            for (int j = 2; j <= x2; j++) {
                for (int k = 2; k <= x3 ; k+=2) {

                    if (j == 2 || j == 3 || j == 5 || j == 7){

                        System.out.printf("%d %d %d%n",i,j,k);
                    }

                }

            }

        }

    }
}

