package TestExams_15_16_June2019;

import java.util.Scanner;

public class P01_MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfMovie = scanner.nextLine();
        int countDays = Integer.parseInt(scanner.nextLine());
        int countTickets = Integer.parseInt(scanner.nextLine());
        double priceOfTicket = Double.parseDouble(scanner.nextLine());
        int percentPerCinema = Integer.parseInt(scanner.nextLine());


        double totalSum = countDays * countTickets * priceOfTicket;
        double moneyForCinema = totalSum * percentPerCinema / 100;

        double profit = totalSum - moneyForCinema;

        System.out.printf("The profit from the movie %s is %.2f lv.",nameOfMovie,profit);




    }
}
