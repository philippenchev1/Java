package TestExams_20_21_April2019;

import java.util.Scanner;

public class P03_PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String eggSize = scanner.nextLine();
        String color = scanner.nextLine();
        int numBatch =Integer.parseInt(scanner.nextLine());

        double price = 0;
        double finalPrice = 0;

        switch (eggSize){
            case "Large":
                switch (color){
                    case "Red":
                        price = numBatch * 16;
                        break;
                    case "Green":
                        price = numBatch * 12;
                        break;
                    case "Yellow":
                        price = numBatch * 9;
                        break;
                }
                break;
            case "Medium":
                switch (color){
                    case "Red":
                        price = numBatch * 13;
                        break;
                    case "Green":
                        price = numBatch * 9;
                        break;
                    case "Yellow":
                        price = numBatch * 7;
                        break;
                }
                break;
            case "Small":
                switch (color){
                    case "Red":
                        price = numBatch * 9;
                        break;
                    case "Green":
                        price = numBatch * 8;
                        break;
                    case "Yellow":
                        price = numBatch * 5;
                        break;
                }
                break;
        }

        finalPrice = price * 0.65;

        System.out.printf("%.2f leva.",finalPrice);



    }
}
