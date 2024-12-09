package TestExams_18_19_July2020;

import java.util.Scanner;

public class P03_AluminiumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String size = scanner.nextLine();
        String delivery = scanner.nextLine();

        double totalPrice = 0;
        boolean isValid = true;

        switch (size){
            case "90X130":
                totalPrice = count * 110;
                if (count<10){
                    isValid = false;
                }else if (count > 30 && count <= 60){
                    totalPrice = totalPrice * 0.95;
                } else if (count > 60) {
                    totalPrice = totalPrice * 0.92;

                }
                break;

            case "100X150":
                totalPrice = count * 140;
                if (count < 10){
                    isValid = false;
                } else if (count > 40 && count <= 80) {
                    totalPrice = totalPrice * 0.94;

                } else if (count > 80) {
                    totalPrice = totalPrice * 0.9;

                }
                break;

            case "130X180":
                totalPrice = count * 190;
                if (count < 10){
                    isValid = false;
                } else if (count > 20 && count <= 50) {
                    totalPrice = totalPrice * 0.93;
                } else if (count > 50) {
                    totalPrice = totalPrice * 0.88;
                }
                break;

            case "200X300":
                totalPrice = count * 250;
                if (count<10){
                    isValid = false;
                } else if (count > 25 && count <= 50) {
                    totalPrice = totalPrice * 0.91;
                } else if (count > 50) {
                    totalPrice = totalPrice * 0.86;

                }
                break;
        }

        if (delivery.equals("With delivery")){
            totalPrice = totalPrice + 60;
        } else if (delivery.equals("Without delivery")) {
            totalPrice = totalPrice * 1;

        }

        if (count > 99){
            totalPrice = totalPrice * 0.96;
        }

        if (!isValid){
            System.out.printf("Invalid order");
        }else {
            System.out.printf("%.2f BGN",totalPrice);
        }


    }
}
