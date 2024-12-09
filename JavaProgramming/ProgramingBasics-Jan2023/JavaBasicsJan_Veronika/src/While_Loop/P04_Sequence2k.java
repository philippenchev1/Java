package While_Loop;

import java.util.Scanner;

public class P04_Sequence2k {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int number = 1;

        while (number <= num ){
            System.out.println(number);
            number = number * 2 + 1 ;


        }

    }
}
