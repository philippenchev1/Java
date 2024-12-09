package TestExams_15_16_June2019;

import java.util.Scanner;

public class P04_MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        String actorName = scanner.nextLine();

        while (!actorName.equals("ACTION")){
            if (actorName.length() > 15){
                budget -= budget * 0.2;
            }else {
                double salary = Double.parseDouble(scanner.nextLine());
                budget -= salary;
            }
            if (budget < 0){
                break;
            }
            actorName = scanner.nextLine();
        }

        if (actorName.equals("ACTION")) {
            System.out.printf("We are left with %.2f leva.", budget);
        }else {
            System.out.printf("We need %.2f leva for our actors.",Math.abs(budget));
        }





    }
}
