package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PP03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //3.	Sum Even Numbers
        //Read an array from the console and sum only the even numbers.

        int[] numbers = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int sum = 0;

        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] % 2 == 0){
                sum += numbers[i];
            }

        }

        System.out.println(sum);
    }
}
