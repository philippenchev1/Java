package ConditionalStatements;

import java.util.Scanner;

public class PP06SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double speed = Double.parseDouble(scanner.nextLine());

        if (speed <= 10) {
            System.out.printf("slow");
        }else if (speed > 10 && speed <=50) {
            System.out.printf("average");
        }else if (speed>50 && speed<= 150) {
            System.out.printf("fast");
        }else if (speed>150 && speed<=1000){
            System.out.printf("ultra fast");
        }else {
            System.out.printf("extremely fast");
        }
    }
}
