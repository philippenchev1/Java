package L03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String projection =scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double income;
        switch (projection) {
            case "Premiere":
                income = rows * columns * 12;
                break;
            case "Normal":
                income = rows * columns * 7.5;
                break;
            case "Discount":
                income = rows * columns * 5;
                break;
            default:
                income = 0;
                break;
        }

        System.out.printf("%.2f leva",income);


    }
}
