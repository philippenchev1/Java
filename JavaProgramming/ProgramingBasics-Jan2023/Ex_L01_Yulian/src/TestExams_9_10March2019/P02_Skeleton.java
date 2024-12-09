package TestExams_9_10March2019;

import java.util.Scanner;

public class P02_Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutes = Integer.parseInt(scanner.nextLine());
        int seconds = Integer.parseInt(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        int secondsPer100Meters = Integer.parseInt(scanner.nextLine());

        int totalSecond = (minutes * 60) + seconds;
        double late = length / 120;
        double totalLateTime = late * 2.5;
        double timeMartin  = ((length / 100)*secondsPer100Meters - totalLateTime);

        if (timeMartin <= totalSecond){
            System.out.printf("Marin Bangiev won an Olympic quota!%n");
            System.out.printf("His time is %.3f.",timeMartin);
        }else {
            System.out.printf("No, Marin failed! He was %.3f second slower.",Math.abs(timeMartin-totalSecond));
        }

    }
}
