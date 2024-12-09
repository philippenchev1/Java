package L02ConditionalStatments;

import java.util.Scanner;

public class PP04TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kilometers = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();

        if (dayOrNight.equals("day")){
            if (kilometers >= 100){
                double trainPrice = kilometers * 0.06;
                System.out.printf("%.2f",trainPrice);

            } else if (kilometers >= 20 ) {
                double busPrice = kilometers * 0.09;
                System.out.printf("%.2f",busPrice);
            }else if (kilometers < 20){
                double taxiPrice = 0.70+(kilometers*0.79);
                System.out.printf("%.2f",taxiPrice);
            }



        } else if (dayOrNight.equals("night")) {
            if (kilometers >= 100){
                double nightTrainPrice = kilometers * 0.06;
                System.out.printf("%.2f",nightTrainPrice);
            } else if (kilometers >= 20 ) {
                double nightBusPrice = kilometers * 0.09;
                System.out.printf("%.2f",nightBusPrice);
            }else if (kilometers < 20){
                double nightTaxiPrice = 0.70+(kilometers*0.9);
                System.out.printf("%.2f",nightTaxiPrice);



        }

        }

    }
}
