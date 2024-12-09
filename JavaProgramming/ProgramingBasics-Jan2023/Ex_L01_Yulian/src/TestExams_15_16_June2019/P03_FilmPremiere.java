package TestExams_15_16_June2019;

import java.util.Scanner;

public class P03_FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    String name = scanner.nextLine();
    String pack = scanner.nextLine();
    int numTickets = Integer.parseInt(scanner.nextLine());

    double totalPrice = 0;

//"Drink", "Popcorn" или "Menu
    switch (name){
        case "John Wick":
            if (pack.equals("Drink")){
                totalPrice = numTickets * 12;
            } else if (pack.equals("Popcorn")) {
                totalPrice = numTickets * 15;
            } else if (pack.equals("Menu")) {
                totalPrice = numTickets * 19;
            }
            break;
        case "Star Wars":
            if (pack.equals("Drink")){
                totalPrice = numTickets * 18;
            } else if (pack.equals("Popcorn")) {
                totalPrice = numTickets * 25;
            } else if (pack.equals("Menu")) {
                totalPrice = numTickets * 30;
            }
            if (numTickets >= 4){
                totalPrice = totalPrice * 0.7;
            }
            break;
        case "Jumanji":
            if (pack.equals("Drink")){
                totalPrice = numTickets * 9;
            } else if (pack.equals("Popcorn")) {
                totalPrice = numTickets * 11;
            } else if (pack.equals("Menu")) {
                totalPrice = numTickets * 14;
            }
            if (numTickets == 2){
                totalPrice = totalPrice * 0.85;
            }
            break;
    }

        System.out.printf("Your bill is %.2f leva.",totalPrice);


    }
}
