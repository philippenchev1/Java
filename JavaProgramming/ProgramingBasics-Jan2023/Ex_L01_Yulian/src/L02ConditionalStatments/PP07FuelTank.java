package L02ConditionalStatments;

import java.util.Scanner;

public class PP07FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        int litresFuel = Integer.parseInt(scanner.nextLine());

        if (fuelType.equals("Diesel")){
            if (litresFuel>=25){
                System.out.printf("You have enough diesel.");
            }else {
                System.out.printf("Fill your tank with diesel!");
            }
        } else if (fuelType.equals("Gasoline")) {
            if (litresFuel>=25){
                System.out.printf("You have enough gasoline.");
            }else {
                System.out.printf("Fill your tank with gasoline!");
            }
        } else if (fuelType.equals("Gas")) {
            if (litresFuel>=25){
                System.out.printf("You have enough gas.");
            }else {
                System.out.printf("Fill your tank with gas!");
            }

        }else{
            System.out.printf("Invalid fuel!");

    }
    }
}
