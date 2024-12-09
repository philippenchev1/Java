package PRACTICE;

import java.util.Scanner;

public class PE04_TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        double averageAssessment = 0;
        int countOfPresentation = 0;

        while (!command.equals("Finish")){
            String nameOfPresentation = command;
            countOfPresentation ++;

            double currentAverageAssessment = 0;

            for (int i = 1; i <= n ; i++) {
                double currentAssessment = Double.parseDouble(scanner.nextLine());
                averageAssessment += currentAssessment;
                currentAverageAssessment += currentAssessment;


            }

            System.out.printf("%s - %.2f.%n",nameOfPresentation,currentAverageAssessment / n);



            command = scanner.nextLine();
        }

        System.out.printf("Student,s final assessment is %.2f.",averageAssessment / (n * countOfPresentation));



    }
}
