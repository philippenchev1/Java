package L01_Exercises;

import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // сума = депозирана сума + срок * ((депозит * лихвен процент) / 12)

        double deposite = Double.parseDouble(scanner.nextLine());

        int monts = Integer.parseInt(scanner.nextLine());

        double percent = Double.parseDouble(scanner.nextLine());

        double  amountpermount = (deposite *(percent/100))/12;

        double total = deposite + amountpermount * monts;


        System.out.println(total);

    }
}
