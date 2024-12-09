package L04_ForCycle;

import java.util.Scanner;

public class MEP03_Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCargos = Integer.parseInt(scanner.nextLine());

        int bus = 0;
        double busPrice = 0;
        int truck = 0;
        double truckPrice = 0;
        int train = 0;
        double trainPrice = 0;
        int sumTonnage = 0;

        for (int i = 1; i <= numCargos ; i++) {
            int tonnage = Integer.parseInt(scanner.nextLine());

            sumTonnage += tonnage;

            if(tonnage<=3){
                bus+= tonnage;
                busPrice += tonnage*200;
            } else if (tonnage<=11) {
                truck+= tonnage;
                truckPrice += tonnage*175;
            }else {
                train+=tonnage;
                trainPrice += tonnage*120;
            }

        }
        double averagePrice=(busPrice+trainPrice+truckPrice) / sumTonnage;
        double percentBus = (bus*1.0 / sumTonnage)*100;
        double percentTruck = (truck*1.0 / sumTonnage)*100;
        double percentTrain = (train*1.0 / sumTonnage)*100;

        System.out.printf("%.2f%n",averagePrice);
        System.out.printf("%.2f%%%n",percentBus);
        System.out.printf("%.2f%%%n",percentTruck);
        System.out.printf("%.2f%%%n",percentTrain);
    }
}
