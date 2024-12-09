package TestExams_18_19_July2020;

import java.util.Scanner;

public class P06_BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        int starThousand = start / 1000 % 10;
        int startHundreds = start / 100 % 10;
        int startTens = start / 10 % 10;
        int startUnits = start % 10;

        int endThousand = end / 1000 % 10;
        int endHundreds = end / 100 % 10;
        int endTens = end / 10 % 10;
        int endUnits = end % 10;

        for (int i = starThousand; i <= endThousand ; i++) {
            for (int j = startHundreds; j <= endHundreds ; j++) {
                for (int k = startTens; k <= endTens ; k++) {
                    for (int l = startUnits; l <= endUnits ; l++) {
                        boolean isOdd = i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0;

                        if (isOdd){
                            System.out.printf("%d%d%d%d ",i,j,k,l);
                        }

                    }

                }

            }

        }


    }
}
