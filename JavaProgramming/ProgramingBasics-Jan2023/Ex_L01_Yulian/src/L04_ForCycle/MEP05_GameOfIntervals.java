package L04_ForCycle;

import java.util.Scanner;

public class MEP05_GameOfIntervals {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int moves = Integer.parseInt(scanner.nextLine());

        int numTo9 = 0;
        int numTo19 = 0;
        int numTo29 = 0;
        int numTo39 = 0;
        int numTo50 = 0;
        int invalidNum = 0;

        double finalResult = 0;


        for (int i = 1; i <= moves ; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            boolean isValid = num >= 0 && num <=50;

            if (!isValid){
                invalidNum++;
                finalResult = finalResult / 2;
            } else if ( num <=9){
                numTo9++;
                finalResult += num * 0.2;
            } else if (num <= 19) {
                numTo19++;
                finalResult += num * 0.3;
            } else if (num <=29) {
                numTo29++;
                finalResult += num * 0.4;
            } else if (num <=39) {
                numTo39++;
                finalResult += 50;
            } else if (num <= 50) {
                numTo50++;
                finalResult += 100;
            } else if (num <0 && num >50){
                invalidNum++;
                finalResult = finalResult / 2;
            }
        }

        double percentTo9 = numTo9 * 1.0/moves * 100;
        double percentTo19 = numTo19 * 1.0/moves * 100;
        double percentTo29 = numTo29 * 1.0/moves * 100;
        double percentTo39 = numTo39 * 1.0/moves * 100;
        double percentTo50 = numTo50 * 1.0/moves * 100;
        double percentInvalid = invalidNum * 1.0/moves * 100;

        System.out.printf("%.2f%n",finalResult);
        System.out.printf("From 0 to 9: %.2f%%%n",percentTo9);
        System.out.printf("From 10 to 19: %.2f%%%n",percentTo19);
        System.out.printf("From 20 to 29: %.2f%%%n",percentTo29);
        System.out.printf("From 30 to 39: %.2f%%%n",percentTo39);
        System.out.printf("From 40 to 50: %.2f%%%n",percentTo50);
        System.out.printf("Invalid numbers: %.2f%%%n",percentInvalid);
    }
}
