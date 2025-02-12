package L04_ForCycle;

import java.util.Scanner;

public class MEP11_OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());

        double oddSum = 0.00;
        double oddMax = -1000000000;
        double oddMin = 1000000000;
        double evenSum = 0.00;
        double evenMax = -1000000000;
        double evenMin = 1000000000;


        for (int i = 1; i <= num; i++) {
            double currentNum = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0){
                evenSum += currentNum;
                if (currentNum>evenMax){
                    evenMax = currentNum;
                }
                if (currentNum<evenMin){
                    evenMin = currentNum;
                }
            }else {
                oddSum += currentNum;
                if (currentNum>oddMax){
                    oddMax = currentNum;
                }
                if (currentNum<oddMin){
                    oddMin = currentNum;
                }
            }


        }

        System.out.printf("OddSum=%.2f,%n",oddSum);

        if (oddMin == 1000000000){
            System.out.printf("OddMin=No,%n");
        }else {
            System.out.printf("OddMin=%.2f,%n",oddMin);
        }
        if(oddMax == -1000000000){
            System.out.printf("OddMax=No,%n");
        }else {
            System.out.printf("OddMax=%.2f,%n",oddMax);
        }

        System.out.printf("EvenSum=%.2f,%n",evenSum);
        if(evenMin == 1000000000){
            System.out.printf("EvenMin=No,%n");
        }else {
            System.out.printf("EvenMin=%.2f,%n",evenMin);
        }

        if(evenMax == -1000000000){
            System.out.printf("EvenMax=No%n");
        }else {
            System.out.printf("EvenMax=%.2f%n",evenMax);
        }



    }
}
