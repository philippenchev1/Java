package FirstStepInCoding;

import java.util.Scanner;

public class P08PetShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dogFoodPack = Integer.parseInt(scanner.nextLine());
        int catFoodPack = Integer.parseInt(scanner.nextLine());

        double dogFoodPrice = dogFoodPack * 2.50;
        int catFoodPrice = catFoodPack * 4 ;

        double  finalSum = dogFoodPrice + catFoodPrice ;


        System.out.println("Total price " + finalSum + " Lv." );
    }


    }

