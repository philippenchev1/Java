package L01_SyntaxConditionalStatementsLoopsExercise;

import java.util.Scanner;

public class P01_Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int years = Integer.parseInt(scanner.nextLine());

        if (years >= 0 && years <= 2){
            System.out.println("baby");
        } else if (years >= 3 && years <= 13) {
            System.out.println("child");
        } else if (years >= 14 && years <= 19 ) {
            System.out.println("teenager");
        } else if (years >=20 && years <= 65) {
            System.out.println("adult");
        } else {
            System.out.println("elder");
        }


    }
}
