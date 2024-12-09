package L06_NestedLoops;

import java.util.Scanner;

public class P04_TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String nameOfPresentation = scanner.nextLine();

        double totalGradeSum = 0;
        int countPresentation = 0;


        while (!nameOfPresentation.equals("Finish")){
            String name = nameOfPresentation;
            double sumGrades = 0;

            for (int i = 1; i <= n ; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                sumGrades += currentGrade;



            }
            double averageGradePerPresentation = sumGrades / n;
            totalGradeSum += averageGradePerPresentation;
            countPresentation++;

            System.out.printf("%s - %.2f.%n",name,averageGradePerPresentation);

            nameOfPresentation = scanner.nextLine();

        }

        System.out.printf("Student's final assessment is %.2f.",totalGradeSum/countPresentation);


    }
}
