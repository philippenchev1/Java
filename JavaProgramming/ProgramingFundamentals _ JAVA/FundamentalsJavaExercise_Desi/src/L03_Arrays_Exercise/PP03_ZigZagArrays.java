package L03_Arrays_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PP03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCouples = Integer.parseInt(scanner.nextLine());

        List<String> leftNumbers = new ArrayList<>();
        List<String> rightNumbers = new ArrayList<>();
        int countIterations = 0;
        for (int i = 1; i <= countCouples ; i++) {
            countIterations++;
            String[] numbers = scanner.nextLine().split(" ");
            String leftNumber = numbers[0];
            String rightNumber = numbers[1];
            if (countIterations % 2 != 0){
                leftNumbers.add(leftNumber);
                rightNumbers.add(rightNumber);
            }else {
                leftNumbers.add(rightNumber);
                rightNumbers.add(leftNumber);
            }

        }

        for (String leftNumber : leftNumbers) {
            System.out.print(leftNumber + " ");
        }

        System.out.println();

        for (String rightNumber : rightNumbers) {
            System.out.print(rightNumber + " ");

        }



    }
}
