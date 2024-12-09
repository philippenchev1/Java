package L01_SyntaxConditionalStatementsLoopsExercise;

import java.util.Scanner;

public class P03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double totalPrice = 0;


        switch (typeOfGroup){
            case "Students":
                if (dayOfWeek.equals("Friday")){
                    totalPrice = countPeople * 8.45;
                } else if (dayOfWeek.equals("Saturday")) {
                    totalPrice = countPeople * 9.80;
                } else if (dayOfWeek.equals("Sunday")) {
                    totalPrice = countPeople * 10.46;
                }
                if (countPeople >= 30){
                    totalPrice = totalPrice * 0.85;
                }
                break;
            case "Business":
                if (countPeople >= 100){
                    countPeople = countPeople - 10;
                }
                if (dayOfWeek.equals("Friday")){
                    totalPrice = countPeople * 10.90;
                } else if (dayOfWeek.equals("Saturday")) {
                    totalPrice = countPeople * 15.60;
                } else if (dayOfWeek.equals("Sunday")) {
                    totalPrice = countPeople * 16.00;
                }

                break;
            case "Regular":
                if (dayOfWeek.equals("Friday")){
                    totalPrice = countPeople * 15;
                } else if (dayOfWeek.equals("Saturday")) {
                    totalPrice = countPeople * 20;
                } else if (dayOfWeek.equals("Sunday")) {
                    totalPrice = countPeople * 22.50;
                }
                if (countPeople >= 10 && countPeople <= 20){
                    totalPrice = totalPrice * 0.95;
                }
                break;
        }

        System.out.printf("Total price: %.2f",totalPrice);

    }
}
