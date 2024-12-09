package Arrays;

import java.util.Scanner;

public class P02_PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];

        for (int i = 0; i < n ; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = n - 1; i >= 0 ; i--) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();


    }
}
