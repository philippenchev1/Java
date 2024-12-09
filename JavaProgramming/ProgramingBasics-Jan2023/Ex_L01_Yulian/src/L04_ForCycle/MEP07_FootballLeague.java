package L04_ForCycle;

import java.util.Scanner;

public class MEP07_FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int numOfFens = Integer.parseInt(scanner.nextLine());

        int sectorA = 0;
        int sectorB = 0;
        int sectorV = 0;
        int sectorG = 0;

        for (int i = 1; i <= numOfFens ; i++) {
            String group = scanner.nextLine();

            switch (group){
                case "A":
                    sectorA++;
                break;
                case "B":
                    sectorB++;
                break;
                case "V":
                    sectorV++;
                break;
                case "G":
                    sectorG++;
                break;
            }

        }

        double percentSectorA = sectorA * 1.0/numOfFens * 100;
        double percentSectorB = sectorB * 1.0/numOfFens * 100;
        double percentSectorV = sectorV * 1.0/numOfFens * 100;
        double percentSectorG = sectorG * 1.0/numOfFens * 100;

        double percentAllFens = numOfFens*1.0/capacity * 100;

        System.out.printf("%.2f%%%n",percentSectorA);
        System.out.printf("%.2f%%%n",percentSectorB);
        System.out.printf("%.2f%%%n",percentSectorV);
        System.out.printf("%.2f%%%n",percentSectorG);
        System.out.printf("%.2f%%%n",percentAllFens);

    }
}
