package Arrays;

import java.util.Scanner;

public class PP02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //2.	Print Numbers in Reverse Order
        //Read n numbers and print them in reverse order.

        int n = Integer.parseInt(scanner.nextLine());

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = n - 1; i >= 0 ; i--) {
            System.out.printf("%d ",array[i]);
        }

        System.out.println();




            


    }
}
