package TestExams_15_16_June2019;

import java.util.Scanner;

public class P05_Oscars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String name = scanner.nextLine();
        double pointAcademy = Double.parseDouble(scanner.nextLine());
        int numAssessments = Integer.parseInt(scanner.nextLine());

        double currentPoints = 0;



        for (int i = 1; i <= numAssessments ; i++) {
            String nameOfAppraiser = scanner.nextLine();
            double pointsOfAppraiser = Double.parseDouble(scanner.nextLine());

            pointAcademy += (nameOfAppraiser.length() * pointsOfAppraiser) / 2;

            if (pointAcademy > 1250.5){
                break;
            }

        }

        if (pointAcademy > 1250.5){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",name,pointAcademy);
        }else {
            System.out.printf("Sorry, %s you need %.1f more!",name,1250.5 - pointAcademy);
        }




    }
}
