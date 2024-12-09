package Methods;

import java.util.Scanner;

public class P09_GreaterOfTwoValies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type){
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(firstNum,secondNum));
                break;
            case "char":
                char firstSymbol = scanner.nextLine().charAt(0);
                char secondSymbol = scanner.nextLine().charAt(0);
                System.out.println(getMax(firstSymbol,secondSymbol));
                break;
            case "string":
                String firstText = scanner.nextLine();
                String secondText = scanner.nextLine();
                System.out.println(getMax(firstText,secondText));
                break;
        }

    }

    public static int getMax(int first, int second){
        if (first > second){
            return first;
        } else {
            return second;
        }
    }

    public static char getMax(char first, char second){
        if (first > second){
            return first;
        }else {
            return second;
        }
    }

    public static String getMax(String first, String second){
        if (first.compareTo(second) > 0){
            return first;
        }else {
            return second;
        }
    }
}
