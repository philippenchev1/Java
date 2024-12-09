package L03_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class PME01_EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1.	Encrypt, Sort and Print Array
        //Write a program that reads a sequence of strings from the console. Encrypt every string by summing:
        //•	The code of each vowel multiplied by the string length.
        //•	The code of each consonant is divided by the string length.
        //Sort the number sequence in ascending order and print it on the console.
        //On the first line, you will always receive the number of strings you must read.

        int n = Integer.parseInt(sc.nextLine());
        int[] numbersSum = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();

            for (int b = 0 ; b < input.length(); b++) {
                if (input.charAt(b) == 'a' || input.charAt(b) == 'e' || input.charAt(b) == 'i' || input.charAt(b) == 'o' || input.charAt(b) == 'u' || input.charAt(b) == 'A'
                        || input.charAt(b) == 'E' || input.charAt(b) == 'I' || input.charAt(b) == 'O' || input.charAt(b) == 'U') {
                    sum += input.charAt(b) * input.length();
                } else {
                    sum += input.charAt(b) / input.length();
                }
            }
            numbersSum[i] = sum;
            sum = 0;
        }
        Arrays.sort(numbersSum);
        for (int result : numbersSum) {
            System.out.println(result);
        }
    }

}