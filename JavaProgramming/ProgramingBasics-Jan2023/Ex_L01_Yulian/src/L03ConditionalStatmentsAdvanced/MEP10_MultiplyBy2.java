package L03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class MEP10_MultiplyBy2 {
    public static void main(String[] args) {

        double x = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i> 0; i++) {

            x = Double.parseDouble(scanner.nextLine());

            if (x < 0) {
                System.out.println("Negative number!");
                break;
            } else {
                System.out.printf("Result: %.2f%n",x*2);
            }

        }
    }
}


