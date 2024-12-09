package Exams_18_19_February2023;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        От конзолата се четат поредица от числа, всяко на отделен ред:
//•	На първия ред – N – брой дни, в които г-жа Иванова тренира  – цяло число в интервала [1...50]
//•	На втория ред – M – километрите, които е избягала първия ден – реално число в интервала [1.00…500.00]
//•	За всеки един ден на отделен ред :
//	Процентите, с които се увеличава дневната си норма – цяло число в интервала [1…100]

        int days = Integer.parseInt(scanner.nextLine());
        double firstDayKm = Double.parseDouble(scanner.nextLine());

        double sumKm = firstDayKm;
        double dayKm = 0;

        for (int i = 1; i <= days ; i++) {
            int percent = Integer.parseInt(scanner.nextLine());
            sumKm += ((percent * sumKm)/100);
            dayKm = dayKm + sumKm;



        }
        double totalKm = firstDayKm + dayKm;

        if (totalKm > 1000){
            System.out.printf("You've done a great job running %.0f more   kilometers!",Math.ceil(totalKm-1000));
        }else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers",Math.ceil(1000-totalKm));
        }


    }
}
