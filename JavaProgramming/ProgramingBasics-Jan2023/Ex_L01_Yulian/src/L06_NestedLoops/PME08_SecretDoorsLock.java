package L06_NestedLoops;

import java.util.Scanner;

public class PME08_SecretDoorsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hundreds = Integer.parseInt(scanner.nextLine());
        int dozens = Integer.parseInt(scanner.nextLine());
        int ones = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= hundreds ; i++) {
            for (int j = 1; j <= dozens ; j++) {
                for (int k = 1; k <= ones ; k++) {
                    if (j == 2 || j == 3 || j == 5 || j == 7) {
                        if (i % 2 == 0 && k % 2 == 0) {
                            System.out.printf("%d %d %d%n", i, j, k);
                        }
                    }



                }

            }

        }

    }
}
