package L04_ForCycle;

import java.util.Scanner;

public class MEP04_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStudents = Integer.parseInt(scanner.nextLine());

        double top = 0;
        double good = 0;
        double middle = 0;
        double fail = 0;

        double sumAssessment = 0;



        for (int i = 1; i <= numStudents; i++) {
            double assessment = Double.parseDouble(scanner.nextLine());

            if (assessment < 3.00){
                fail++;
                sumAssessment+=assessment;
            } else if (assessment<=3.99) {
                middle++;
                sumAssessment+=assessment;
            } else if (assessment<=4.99) {
                good++;
                sumAssessment+=assessment;
            }else {
                top++;
                sumAssessment+=assessment;
            }
        }

        double percentTop = (top/numStudents)*100;
        double percentGood = (good/numStudents)*100;
        double percentMiddle = (middle/numStudents)*100;
        double percentFail = (fail/numStudents)*100;

        double averageAssessment = sumAssessment / numStudents;

        System.out.printf("Top students: %.2f%%%n",percentTop);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",percentGood);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",percentMiddle);
        System.out.printf("Fail: %.2f%%%n",percentFail);
        System.out.printf("Average: %.2f",averageAssessment);



    }
}
