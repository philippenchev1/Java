package PRACTICE;

import java.util.Scanner;

public class PP05_Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String input = scanner.nextLine();

       while (!"End".equals(input)){
           String destination = input;
           double tripPrice = Double.parseDouble(scanner.nextLine());

           double currentSum = 0;

           while (currentSum < tripPrice){
               double amount = Double.parseDouble(scanner.nextLine());
               currentSum += amount;
           }

           System.out.printf("Going to %s!%n",destination);

           input = scanner.nextLine();
       }


    }
}
