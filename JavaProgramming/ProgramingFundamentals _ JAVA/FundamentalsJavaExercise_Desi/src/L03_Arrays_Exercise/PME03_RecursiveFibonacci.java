package L03_Arrays_Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PME03_RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //3.	Recursive Fibonacci
        //The Fibonacci sequence is quite a famous sequence of numbers. Each sequence member is calculated from the sum of the two previous elements.
        // The first two elements are 1, 1. Therefore the sequence goes like 1, 1, 2, 3, 5, 8, 13, 21, 34…
        //The following sequence can be generated with an array, but that's easy, so your task is to implement it recursively.
        //So if the function GetFibonacci(n) returns the n’th Fibonacci number we can express it using GetFibonacci(n) = GetFibonacci(n-1) + GetFibonacci(n-2).
        //However, this will never end and in a few seconds, a StackOverflow Exception is thrown. For the recursion to stop, it has to have a "bottom".
        // At the bottom of the recursion is GetFibonacci(2) should return 1, and GetFibonacci(1) should return 1.

        int number = Integer.parseInt(scanner.nextLine());
        int[] numArr = new int[number];

        if (number == 1) {
            System.out.println(1);
            return;
        }

        numArr[0] = 1;
        numArr[1] = 1;
        int index = 2;
        if (number > 2) {
            for (int i = 0; i < numArr.length - 2; i++) {
                numArr[index] = numArr[i] + numArr[i + 1];
                index++;
            }
        }

        System.out.println(numArr[number - 1]);
    }
}

