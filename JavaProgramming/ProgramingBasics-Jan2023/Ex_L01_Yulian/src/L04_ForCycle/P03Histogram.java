package L04_ForCycle;

import java.util.Scanner;

public class P03Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int countNumbers = Integer.parseInt(scanner.nextLine());

        double countP1 = 0;
        double countP2 = 0;
        double countP3 = 0;
        double countP4 = 0;
        double countP5 = 0;

        for (int i = 1; i <= countNumbers; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if(number < 200){
                countP1++;
            } else if (number <= 399) {
                countP2++;

            } else if (number <= 599) {
                countP3++;

            }else if (number <= 799) {
                countP4++;
            }else {
                countP5++;
            }


        }

        double percentP1 = countP1 / countNumbers * 100;
        double percentP2 = countP2 / countNumbers * 100;
        double percentP3 = countP3 / countNumbers * 100;
        double percentP4 = countP4 / countNumbers * 100;
        double percentP5 = countP5 / countNumbers * 100;

        System.out.printf("%.2f%%%n",percentP1);
        System.out.printf("%.2f%%%n",percentP2);
        System.out.printf("%.2f%%%n",percentP3);
        System.out.printf("%.2f%%%n",percentP4);
        System.out.printf("%.2f%%%n",percentP5);



    }
}
