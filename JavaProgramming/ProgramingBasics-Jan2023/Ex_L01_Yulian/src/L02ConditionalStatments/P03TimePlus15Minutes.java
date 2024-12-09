package L02ConditionalStatments;

import java.util.Scanner;

public class P03TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = hours * 60 + minutes + 15;
        int finalHours = totalMinutes / 60;
        int finlaMinutes = totalMinutes % 60;

        if (finalHours <24) {
            System.out.printf("%d:%02d",finalHours,finlaMinutes);
        } else {
            finalHours = 0;
            System.out.printf("%d:%02d",finalHours,finlaMinutes);
        }
    }
}
