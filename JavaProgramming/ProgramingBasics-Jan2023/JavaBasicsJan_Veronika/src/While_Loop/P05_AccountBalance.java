package While_Loop;

import java.util.Scanner;

public class P05_AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String increaseMoney = scanner.nextLine();

        double totalMoney = 0;

        while (!increaseMoney.equals("NoMoreMoney")){
            double currentMoney = Double.parseDouble(increaseMoney);

            if (currentMoney < 0){
                System.out.println("Invalid operation!");
                break;
            }

            totalMoney += currentMoney;
            System.out.printf("Increase: %.2f%n",currentMoney);
            increaseMoney = scanner.nextLine();


        }

        System.out.printf("Total: %.2f%n",totalMoney);


    }
}
