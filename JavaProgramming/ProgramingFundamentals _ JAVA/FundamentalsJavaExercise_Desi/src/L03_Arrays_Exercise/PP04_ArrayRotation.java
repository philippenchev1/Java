package L03_Arrays_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PP04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split("\\s+");
        int countRotations = Integer.parseInt(scanner.nextLine());

        List<String> numbersArray = new ArrayList<>();

        for (String number : numbers) {
            numbersArray.add(number);
        }

        for (int i = 1; i <= countRotations ; i++) {
            String firstElement = numbersArray.get(0);
            numbersArray.remove(0);
            numbersArray.add(firstElement);
        }

        for (String number : numbersArray) {
            System.out.print(number + " ");
        }



    }
}
