package Arrays;

import java.util.Scanner;

public class pp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] capitals = scanner.nextLine().split(", ");
        //Sofia, Rome, Berlin, Paris, Madrid
        for (String city : capitals) {
            System.out.printf("%s %n",city);
        }
    }
}
