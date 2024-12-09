package ConditionalStatements;

import java.util.Scanner;

public class PP05Num100To200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (number < 100) {
            System.out.printf("Less than 100");
        } else if (number>=100 && number <=200) {
            System.out.printf("Between 100 and 200");
        }else {
            System.out.printf("Greater than 200");
        }


    }
}
