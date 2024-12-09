package PRACTICE;

import java.util.Scanner;

public class PE06_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int counterStudent = 0;
        int counterStandard = 0;
        int counterKids = 0;
        int totalTickets = counterStudent + counterStandard + counterKids;



        while (!input.equals("Finish")){
            int availableSeats = Integer.parseInt(scanner.nextLine());
            String command = scanner.nextLine();
            String movieName = input;

            int countTicketsPerMovie = 0;

            while (!command.equals("End")){
                String typeTicket = command;
                countTicketsPerMovie++;

                switch (typeTicket){
                    case "student":
                        counterStudent++;
                        break;
                    case "standard":
                        counterStandard++;
                        break;
                    case "kid":
                        counterKids++;
                        break;
                }

                if (countTicketsPerMovie >= availableSeats){
                    break;
                }
                command = scanner.nextLine();
            }
            totalTickets += countTicketsPerMovie;
            double percentFilled = countTicketsPerMovie * 1.0 / availableSeats * 100;
            System.out.printf("%s - %.2f%% full.%n",movieName,percentFilled);

            input = scanner.nextLine();
        }

        double percentStudentTickets = counterStudent * 1.0 / totalTickets * 100;
        double percentStandardTickets = counterStandard * 1.0 / totalTickets * 100;
        double percentKidsTickets = counterKids * 1.0 / totalTickets * 100;

        System.out.printf("Total tickets: %d%n",totalTickets);
        System.out.printf("%.2f%% student tickets.%n",percentStudentTickets);
        System.out.printf("%.2f%% standard tickets.%n",percentStandardTickets);
        System.out.printf("%.2f%% kids tickets.%n",percentKidsTickets);


    }
}
