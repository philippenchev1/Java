package FirstStepInCoding;

import java.util.Scanner;

public class exersise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inch = Double.parseDouble(scanner.nextLine());

        double cm = 2.54 * inch;

        System.out.println(cm);
    }
}
