package L03_Arrays_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PP01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> peoplesInWagons = new ArrayList<>();

        int sumPeople = 0;
        int countWagons = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= countWagons ; i++) {
            int currentPeoples = Integer.parseInt(scanner.nextLine());
          sumPeople += currentPeoples;
          peoplesInWagons.add(currentPeoples);

        }

        for (Integer peoplesInWagon : peoplesInWagons) {
            System.out.print(peoplesInWagon + " ");
        }
        System.out.println();
        System.out.println(sumPeople);

    }
}
