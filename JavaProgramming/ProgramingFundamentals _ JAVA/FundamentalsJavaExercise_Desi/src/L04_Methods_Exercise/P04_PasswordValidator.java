package L04_Methods_Exercise;

import java.util.Scanner;

public class P04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        boolean isValidLength = isValidLength(input);

        if (!isValidLength){
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean isValidContent = isValidContent(input);

        if (!isValidContent){
            System.out.println("Password must consist only of letters and digits");
        }

        boolean isValidCountDigit = isValidCountDigits(input);
        if (!isValidCountDigit) {
            System.out.println("Password must have at least 2 digits");
        }

        if (isValidLength && isValidContent && isValidCountDigit){
            System.out.println("Password is valid");
        }



    }
    public static boolean isValidLength (String input){
        return input.length() >= 6 && input.length() <= 10;
    }

    public static boolean isValidContent (String input){
        for (char symbol : input.toCharArray()){
            if (!Character.isLetterOrDigit(symbol)){
                return false;
            }
        }
        return true;
    }

    public static boolean isValidCountDigits (String input){
        int countDigit = 0;
        for (char symbol : input.toCharArray()){
            if (Character.isDigit(symbol)){
                countDigit++;
            }
        }
        return countDigit >= 2;
    }

}
