package Exam_Preparation;

import java.util.Scanner;

public class P01_Pool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double entranceFeed = Double.parseDouble(scanner.nextLine());
        double chairPrice = Double.parseDouble(scanner.nextLine());
        double umbrellaPrice = Double.parseDouble(scanner.nextLine());

        double price = people * entranceFeed;
        double allChairs = Math.ceil(people * 0.75) * chairPrice;
        double allUmbrellas = Math.ceil(people*0.50) * umbrellaPrice;

        double totalSum = price + allChairs + allUmbrellas;

        System.out.printf("%.2f lv.",totalSum);





    }
}
