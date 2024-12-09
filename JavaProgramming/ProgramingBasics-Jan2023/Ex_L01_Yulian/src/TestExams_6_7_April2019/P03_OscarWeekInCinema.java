package TestExams_6_7_April2019;

import java.util.Scanner;

public class P03_OscarWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        String hallType = scanner.nextLine();
        int countTickets = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (movieName){
            case "A Star Is Born":
                switch (hallType){
                    case "normal":
                        price = countTickets * 7.50;
                        break;
                    case "luxury":
                        price = countTickets * 10.50;
                        break;
                    case "ultra luxury":
                        price = countTickets * 13.50;
                        break;
                }
                break;

            case "Bohemian Rhapsody":
                switch (hallType){
                    case "normal":
                        price = countTickets * 7.35;
                        break;
                    case "luxury":
                        price = countTickets * 9.45;
                        break;
                    case "ultra luxury":
                        price = countTickets * 12.75;
                        break;
                }
                break;

            case "Green Book":
                switch (hallType){
                    case "normal":
                        price = countTickets * 8.15;
                        break;
                    case "luxury":
                        price = countTickets * 10.25;
                        break;
                    case "ultra luxury":
                        price = countTickets * 13.25;
                        break;
                }
                break;

            case "The Favourite":
                switch (hallType){
                    case "normal":
                        price = countTickets * 8.75;
                        break;
                    case "luxury":
                        price = countTickets * 11.55;
                        break;
                    case "ultra luxury":
                        price = countTickets * 13.95;
                        break;
                }
                break;
        }

        System.out.printf("%s -> %.2f lv.",movieName,price);



    }
}
