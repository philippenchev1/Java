package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P10InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Дадено число е валидно, ако е в диапазона [100…200] или е 0.
//        Да се напише програма, която чете цяло число, въведено от потребителя, и
//        печата "invalid" ако въведеното число не е валидно.

        int num = Integer.parseInt(scanner.nextLine());

        if (num >= 100 && num <= 200 || num == 0 ){

        }else {
            System.out.println("invalid");
        }
    }
}
