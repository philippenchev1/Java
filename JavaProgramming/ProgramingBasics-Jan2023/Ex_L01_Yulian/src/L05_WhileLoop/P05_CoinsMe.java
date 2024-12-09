package L05_WhileLoop;

import java.util.Scanner;

public class P05_CoinsMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());

        double allCoins = Math.floor( sum * 100 );
        int coinsCounter = 0;

        while (allCoins > 0){

            if (allCoins >= 200){
                allCoins -= 200;
                coinsCounter++;
            } else if (allCoins >= 100) {
                allCoins -= 100;
                coinsCounter++;

            }else if (allCoins >= 50) {
                allCoins -= 50;
                coinsCounter++;

            }else if (allCoins >= 20) {
                allCoins -= 20;
                coinsCounter++;

            }else if (allCoins >= 10) {
                allCoins -= 10;
                coinsCounter++;

            }else if (allCoins >= 5) {
                allCoins -= 5;
                coinsCounter++;

            }else if (allCoins >= 2) {
                allCoins -= 2;
                coinsCounter++;

            }else if (allCoins >= 1) {
                allCoins -= 1;
                coinsCounter++;
            }


        }

        System.out.println(coinsCounter);


    }
}
