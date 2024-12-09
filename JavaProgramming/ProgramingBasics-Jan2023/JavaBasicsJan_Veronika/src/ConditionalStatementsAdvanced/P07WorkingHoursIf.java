package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P07WorkingHoursIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();


//        Да се напише програма, която чете час от денонощието(цяло число) и ден от седмицата(текст) -
//        въведени от потребителя и проверява дали офисът на фирма е отворен,
//        като работното време на офисът е от 10-18 часа, от понеделник до събота включително
        if (dayOfWeek.equals("Monday")) {
            if (hours >= 10 && hours <= 18) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        } else if (dayOfWeek.equals("Tuesday")) {
            if (hours >= 10 && hours <= 18) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        } else if (dayOfWeek.equals("Wednesday")) {
            if (hours >= 10 && hours <= 18) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        } else if (dayOfWeek.equals("Thursday")) {
            if (hours >= 10 && hours <= 18) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        } else if (dayOfWeek.equals("Friday")) {
            if (hours >= 10 && hours <= 18) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        } else if (dayOfWeek.equals("Saturday")) {
            if (hours >= 10 && hours <= 18) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        } else if (dayOfWeek.equals("Sunday")) {
            System.out.println("closed");
        }
    }
}