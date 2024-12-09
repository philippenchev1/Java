package Arrays;

import java.lang.module.FindException;
import java.util.Scanner;

public class PP04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //4.	Reverse an Array of Strings
        // Write a program to read an array of strings, reverse it and print its elements.
        // The input consists of a sequence of space-separated strings. Print the output on a single line (space separated).

        String[] elements = scanner.nextLine().split(" ");

        for (int index = 0; index < elements.length / 2 ; index++) {
            String oldElement = elements[index];
            elements[index] = elements[elements.length - 1 - index];
            elements[elements.length - 1 - index] = oldElement;

        }

        System.out.println(String.join(" " , elements));

    }
}
