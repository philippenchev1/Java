package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P08CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Да се напише програма която чете ден от седмицата (текст) – въведен от потребителя и принтира на конзолата
//        цената на билет за кино според деня от седмицата:
//  Monday	Tuesday	Wednesday	Thursday	Friday	Saturday	Sunday
//  12	    12	    14	        14	        12	    16	        16

        String dayOfTheWeek = scanner.nextLine();


        switch (dayOfTheWeek) {
            case "Monday":
            case "Tuesday":
            case "Friday":
                System.out.println(12);
                break;
            case "Wednesday":
            case "Thursday":
                System.out.println(14);
                break;
            case "Saturday":
            case "Sunday":
                System.out.println(16);
                break;


        }
    }
}
