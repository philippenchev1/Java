package L04_ForCycle;

import java.util.Scanner;

public class P06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String nameOfActor = scanner.nextLine();
        double pointsOfAcademy = Double.parseDouble(scanner.nextLine());
        int numberExaminers = Integer.parseInt(scanner.nextLine());


        double allPoints = pointsOfAcademy;


        for (int i = 1; i <= numberExaminers; i++) {
            String nameOfExaminer = scanner.nextLine();
            double pointsFromExaminer = Double.parseDouble(scanner.nextLine());

            allPoints += (pointsFromExaminer * nameOfExaminer.length()/2);

            if (allPoints>=1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",nameOfActor,allPoints);
                break;
            }
        }
        if (allPoints<1250.5){
            double diff = Math.abs(1250.5-allPoints);
            System.out.printf("Sorry, %s you need %.1f more!",nameOfActor,diff);
        }

    }
}
