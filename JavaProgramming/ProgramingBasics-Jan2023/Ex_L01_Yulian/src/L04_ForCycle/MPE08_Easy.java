package L04_ForCycle;

import java.util.Scanner;

public class MPE08_Easy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                int n = Integer.parseInt(scanner.nextLine());
                int firstSum = 0;
                int secondSum = 0;
                int diff = 0;
                for (int i = 1; i <= n; i++) {
                    int n1 = Integer.parseInt(scanner.nextLine());
                    int n2 = Integer.parseInt(scanner.nextLine());

                    if (i % 2 != 0) {
                        firstSum = n1 + n2;
                    } else {
                        secondSum = n1 + n2;
                    }

                }

                diff = Math.abs(firstSum - secondSum);

                if (firstSum == secondSum || n < 2) {
                    System.out.printf("Yes, value=%d", firstSum);
                } else {
                    System.out.printf("No, maxdiff=%d", diff);
                }


            }
        }

