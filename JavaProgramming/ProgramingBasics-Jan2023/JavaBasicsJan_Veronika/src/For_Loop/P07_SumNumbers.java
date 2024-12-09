package For_Loop;

import java.util.Scanner;

public class P07_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Да се напише програма, която чете n-на брой цели числа, въведени от потребителя и ги сумира.
//•	От първия ред на входа се въвежда броят числа n.
//•	От следващите n реда се въвежда по едно цяло число.
//        Програмата трябва да прочете числата, да ги сумира и да отпечата сумата им.

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= n ; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;


        }
        System.out.println(sum);

    }
}
