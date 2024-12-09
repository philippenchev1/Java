package L02ConditionalStatments;

import java.util.Scanner;

public class P06WorldSwimmingRecord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Прочитаме от конзолата
        //Пресмятаме забавянето
        //Резултата, за който Иван преплува разстоянието -> разстоянието * времето за 1м + забавянето
        //Правим проверка дали е подобрил рекордът

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeForOneMeter = Double.parseDouble(scanner.nextLine());

        double delay = (Math.floor(distance / 15)) * 12.5;

        double result = distance * timeForOneMeter + delay;

        if(recordInSeconds > result){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", result);
        }else {
            double neededSeconds = result - recordInSeconds;
            System.out.printf("No, he failed! He was %.2f seconds slower.", neededSeconds);
        }
    }
}
