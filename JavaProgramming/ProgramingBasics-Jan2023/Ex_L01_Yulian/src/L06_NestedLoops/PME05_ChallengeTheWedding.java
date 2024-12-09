package L06_NestedLoops;

import java.util.Scanner;

public class PME05_ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mens = Integer.parseInt(scanner.nextLine());
        int womens = Integer.parseInt(scanner.nextLine());
        int tables = Integer.parseInt(scanner.nextLine());

        int countTables = 0;

        for (int i = 1; i <= mens ; i++) {
            for (int j = 1; j <= womens ; j++) {
                    System.out.printf("(%d <-> %d) ",i,j);
                    countTables++;
                    if (countTables == tables){
                        return;
                    }

                }

            }

        }

    }

