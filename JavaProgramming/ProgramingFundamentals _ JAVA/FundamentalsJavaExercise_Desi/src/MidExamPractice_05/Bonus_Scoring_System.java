package MidExamPractice_05;

import java.util.Scanner;

public class Bonus_Scoring_System {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int numberOfLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        double maxBonus = Double.MIN_VALUE;
        int bestStudent = 0;

        for (int i = 1; i <= numberOfStudents ; i++) {
            int attendancesOfEachStudent = Integer.parseInt(scanner.nextLine());
            double totalBonus = 1.0 * attendancesOfEachStudent / numberOfLectures * (5 + additionalBonus);

            if (totalBonus > maxBonus) {
                maxBonus = totalBonus;
                bestStudent = attendancesOfEachStudent;
            }
        }

        System.out.printf("Max Bonus: %.0f.%n", maxBonus);
        System.out.printf("The student has attended %d lectures.", bestStudent);


    }
}
