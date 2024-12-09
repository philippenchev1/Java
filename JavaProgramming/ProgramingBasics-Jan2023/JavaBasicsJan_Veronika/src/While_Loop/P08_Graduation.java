package While_Loop;

import java.util.Scanner;

public class P08_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        double sumGrades = 0;
        int year = 1;
        int excludedCount = 0;


        while (year <=12){
            if (excludedCount > 1) {
                break;
            }

            double currentGrade = Double.parseDouble(scanner.nextLine());

            if (currentGrade < 4.00){
                excludedCount++;
                continue;
            }
                sumGrades += currentGrade;
                year++;
            }

                if (excludedCount >1){
                    System.out.printf("%s has been excluded at %d grade",name,year);

            }else {
                double averageGrades = sumGrades / 12;
                System.out.printf("%s graduated. Average grade: %.2f ",name,averageGrades);

                }

    }
}
