package L03_Arrays_Exercise;

import java.util.Scanner;

public class P01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int countOfPeoplePerWagon = Integer.parseInt(scanner.nextLine());
            System.out.print(countOfPeoplePerWagon + " ");
            sum += countOfPeoplePerWagon;

        }
        System.out.println();
        System.out.println(sum);

    }
}
