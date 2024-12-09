package L03ConditionalStatmentsAdvanced;

import java.util.Scanner;

public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        switch (operator){
            case "+" :
                int sum = numberOne + numberTwo;
                if (sum % 2 == 0){
                    System.out.printf("%d %s %d = %d - even",numberOne,operator,numberTwo,sum);
                }else {
                    System.out.printf("%d %s %d = %d - odd",numberOne,operator,numberTwo,sum);
                }
                break;

            case "-" :
                int diff = numberOne - numberTwo;
                if (diff % 2 == 0){
                    System.out.printf("%d %s %d = %d - even",numberOne,operator,numberTwo,diff);
                }else {
                    System.out.printf("%d %s %d = %d - odd",numberOne,operator,numberTwo,diff);
                }
                break;

            case "*" :
                int multiply = numberOne * numberTwo;
                if (multiply % 2 == 0){
                    System.out.printf("%d %s %d = %d - even",numberOne,operator,numberTwo,multiply);
                }else {
                    System.out.printf("%d %s %d = %d - odd",numberOne,operator,numberTwo,multiply);
                }
                break;

            case "/" :
                if (numberTwo == 0){
                    System.out.printf("Cannot divide %d by zero",numberOne);
                }else {
                    double divide = numberOne * 1.0 / numberTwo;
                    System.out.printf("%d / %d = %.2f", numberOne, numberTwo, divide);
                }
                break;

            case "%" :
                if (numberTwo == 0){
                    System.out.printf("Cannot divide %d by zero",numberOne);
                }else {
                    int divideByRemainder = numberOne % numberTwo;
                    System.out.printf("%d %% %d = %d", numberOne, numberTwo, divideByRemainder);
                }
                break;
        }


    }
}
