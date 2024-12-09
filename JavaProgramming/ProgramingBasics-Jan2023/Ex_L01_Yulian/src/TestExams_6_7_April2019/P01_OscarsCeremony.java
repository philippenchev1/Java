package TestExams_6_7_April2019;

import java.util.Scanner;

public class P01_OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

        double oscarPrice = rent * 0.7;
        double catering = oscarPrice * 0.85;
        double sound = catering * 0.5;
        double totalPrice = rent + oscarPrice + catering + sound;

        System.out.printf("%.2f",totalPrice);


    }
}
