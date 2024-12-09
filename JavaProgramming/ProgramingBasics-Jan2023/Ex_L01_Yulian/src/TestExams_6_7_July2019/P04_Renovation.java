package TestExams_6_7_July2019;

import java.util.Scanner;

public class P04_Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int high = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();


        int sqM = (high * length) * 4;
        int totalSqm = sqM - ((sqM * percent)/100);


        while (!command.equals("Tired!")){
            int litersPaint = Integer.parseInt(command);

            totalSqm -= litersPaint;

            if (totalSqm <= 0){
                break;
            }

            command = scanner.nextLine();
        }

        if (command.equals("Tired!")){
            System.out.printf("%d quadratic m left.",totalSqm);
        } else if (totalSqm < 0) {
            System.out.printf("All walls are painted and you have %d l paint left!",Math.abs(totalSqm));

        } else if (totalSqm == 0) {
            System.out.println("All walls are painted! Great job, Pesho!");
        }


    }
}
