package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class PP04_PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double years = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();

        switch (sex){
            case "m":
                if (years<16){
                    System.out.println("Master");
                }else {
                    System.out.println("Mr.");
                }
                break;
            case "f":
                if (years<16){
                    System.out.println("Miss");
                }else {
                    System.out.println("Ms.");
                }
                break;
        }
    }
}
