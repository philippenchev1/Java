package L03_Arrays_Exercise;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //2.	Common Elements
        //Write a program that prints common elements in two arrays.
        //You have to compare the elements of the second array to the elements of the first.

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (String secondElement : secondArray) {
            for (String firstElement : firstArray) {
                if (secondElement.equals(firstElement)) {
                    System.out.print(firstElement + " ");
                    break;
                }
            }
        }
    }

}

