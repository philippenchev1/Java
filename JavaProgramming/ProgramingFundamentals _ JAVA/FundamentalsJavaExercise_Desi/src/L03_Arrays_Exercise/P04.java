package L03_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //4.	Array Rotation
        //Write a program that receives an array and the number of rotations you have to perform
        //(the first element goes at the end). Print the resulting array.

        int [] array = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int countRotations = Integer.parseInt(scanner.nextLine());

        for (int rotations = 1; rotations <= countRotations ; rotations++) {
            int firstElement = array[0];

            for (int index = 0; index < array.length - 1; index++) {
                array[index] = array[index + 1];


            }
            array[array.length - 1] = firstElement;

        }

        for (int element : array) {
            System.out.print(element + " ");
        }




    }
}
