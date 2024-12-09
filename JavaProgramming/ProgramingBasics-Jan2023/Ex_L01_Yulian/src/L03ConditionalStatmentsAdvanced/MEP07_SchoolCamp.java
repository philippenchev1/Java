package L03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class MEP07_SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int numStudents = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());


        double price = 0;
        String sport = "";

        switch (season) {
            case "Winter":
                if (groupType.equals("boys")){
                    sport = "Judo";
                    price = numStudents * nights * 9.6;
                } else if (groupType.equals("girls")) {
                    sport = "Gymnastics";
                    price = numStudents * nights * 9.6;
                } else if (groupType.equals("mixed")) {
                    sport = "Ski";
                    price = numStudents * nights * 10;
                }
                break;

            case "Spring":
                if (groupType.equals("boys")){
                    sport = "Tennis";
                    price = numStudents * nights * 7.2;
                } else if (groupType.equals("girls")) {
                    sport = "Athletics";
                    price = numStudents * nights * 7.2;
                } else if (groupType.equals("mixed")) {
                    sport = "Cycling";
                    price = numStudents * nights * 9.5;
                }
                break;

            case "Summer":
                if (groupType.equals("boys")){
                    sport = "Football";
                    price = numStudents * nights * 15;
                } else if (groupType.equals("girls")) {
                    sport = "Volleyball";
                    price = numStudents * nights * 15;
                } else if (groupType.equals("mixed")) {
                    sport = "Swimming";
                    price = numStudents * nights * 20;
                }
                break;
        }

        if (numStudents >= 50) {
            price = price * 0.5;
        } else if (numStudents >= 20) {
            price = price * 0.85;
        } else if (numStudents >= 10) {
            price = price * 0.95;

        }

        System.out.printf("%s %.2f lv.",sport,price);


    }
}
