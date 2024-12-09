package L05_WhileLoop;

import java.util.Scanner;

public class P03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        int countDays = 0;
        int spendDays = 0;

        while (availableMoney < neededMoney){
            if (spendDays == 5){
                break;
            }

            String command = scanner.nextLine();
            double currentMoney = Double.parseDouble(scanner.nextLine());
            countDays++;


            if (command.equals("spend")){
                spendDays++;
                availableMoney -= currentMoney;
            } else if (command.equals("save")) {
                availableMoney += currentMoney;
                spendDays = 0;
            }
            if (availableMoney<currentMoney){
                availableMoney = 0;
            }

        }
        if(spendDays==5){
            System.out.printf("You can't save the money.%n");
            System.out.printf("%d",countDays);

        }else {
            System.out.printf("You saved the money for %d days.", countDays);
        }
    }
}
