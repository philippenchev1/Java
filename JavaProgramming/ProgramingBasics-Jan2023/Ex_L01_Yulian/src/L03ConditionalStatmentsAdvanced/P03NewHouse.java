package L03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int countOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());


        double price = 0;

        switch (flowers){
            case "Roses":
                price = countOfFlowers * 5;
                if (countOfFlowers>80){
                    price =price * 0.9;
                }
                break;

            case "Dahlias":
                price = countOfFlowers * 3.80;
                if(countOfFlowers>90){
                    price = price * 0.85;
                }
                break;

            case "Tulips":
                price = countOfFlowers* 2.80;
                if (countOfFlowers>80){
                    price = price * 0.85;
                }
                break;

            case "Narcissus":
                price = countOfFlowers * 3;
                if (countOfFlowers<120){
                    price = price * 1.15;
                }
                break;

            case "Gladiolus":
                price = countOfFlowers * 2.50;
                if (countOfFlowers<80){
                    price = price * 1.2;
                }
                break;
        }

        double leftMoney = Math.abs(budget-price);
        if(budget>=price){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",countOfFlowers,flowers,leftMoney);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.",leftMoney);
        }


    }
}
