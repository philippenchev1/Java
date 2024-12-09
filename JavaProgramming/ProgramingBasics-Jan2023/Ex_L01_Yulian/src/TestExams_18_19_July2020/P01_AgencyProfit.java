package TestExams_18_19_July2020;

import java.util.Scanner;

public class P01_AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        От конзолата се четат 5 реда:
//1.	Име на авиокомпанията - текст
//2.	Брой билети за	 възрастни – цяло число в диапазона [1…400]
//3.	Брой детски билети – цяло число в диапазона [25…120]
//4.	Нетна цена на билет за възрастен – реално число в диапазона [100.0…1600.0]
//5.	Цената на такса обслужване - реално число в диапазона [10.0…50.0]

        String name = scanner.nextLine();
        int countTicketsAdults = Integer.parseInt(scanner.nextLine());
        int countKidsTicket = Integer.parseInt(scanner.nextLine());
        double priceAdultTicket = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());

        double kidsTicketPrice = priceAdultTicket * 0.3;
        double totalPrice = (countTicketsAdults * (priceAdultTicket + tax)) + (countKidsTicket * (kidsTicketPrice + tax));
        double profit = totalPrice * 0.2;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",name,profit);


    }
}
