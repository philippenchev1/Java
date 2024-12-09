package L01_SyntaxConditionalStatementsLoopsExercise;

import java.util.Scanner;

public class P10_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountMoney = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceLightsabers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());
        int countFreeBelts = countStudents / 6;


        double totalMoney = priceLightsabers * Math.ceil(countStudents * 1.1)
                + (priceRobes * countStudents)
                + (priceBelts * (countStudents - countFreeBelts));


        if (totalMoney <= amountMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalMoney);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(amountMoney - totalMoney));
        }


    }
}
