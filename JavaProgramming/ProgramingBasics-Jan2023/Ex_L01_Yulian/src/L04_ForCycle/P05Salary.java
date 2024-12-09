package L04_ForCycle;

import java.util.Scanner;

public class P05Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberTabs =Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= numberTabs ; i++) {
            String nameOfWebsite = scanner.nextLine();

            switch (nameOfWebsite){
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }
        }
            if (salary<=0){
             System.out.println("You have lost your salary.");
            }else {
            System.out.println(salary);
            }



    }
}
