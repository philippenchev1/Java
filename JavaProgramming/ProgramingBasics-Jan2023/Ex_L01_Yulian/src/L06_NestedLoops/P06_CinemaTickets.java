package L06_NestedLoops;

import java.util.Scanner;

public class P06_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int countTickets = 0;
        int countStudentTickets = 0;
        int countKidTickets = 0;
        int countStandardTickets = 0;

        while (!input.equals("Finish")){
            int availableSeats = Integer.parseInt(scanner.nextLine());
            String command = scanner.nextLine();
            String currentMovie = input;

            int countTicketsPerMovie = 0;

            while (!command.equals("End")){
                String ticketType = command;
                countTicketsPerMovie++;


                switch (ticketType){
                    case "standard":
                        countStandardTickets++;
                        break;
                    case "student":
                        countStudentTickets++;
                        break;
                    case "kid":
                        countKidTickets++;
                        break;
                }

                if (countTicketsPerMovie >= availableSeats){
                    break;
                }

                command = scanner.nextLine();
            }

            countTickets += countTicketsPerMovie;

            double percentFilled = countTicketsPerMovie * 1.0 / availableSeats * 100;
            System.out.printf("%s - %.2f%% full.%n",currentMovie,percentFilled);

            input = scanner.nextLine();


        }

        double percentKid = countKidTickets * 1.0 / countTickets * 100;
        double percentStudent = countStudentTickets * 1.0 / countTickets * 100;
        double percentStandard = countStandardTickets * 1.0 / countTickets * 100;


        System.out.printf("Total tickets: %d%n",countTickets);
        System.out.printf("%.2f%% student tickets.%n",percentStudent);
        System.out.printf("%.2f%% standard tickets.%n",percentStandard);
        System.out.printf("%.2f%% kids tickets.%n",percentKid);

    }
}
