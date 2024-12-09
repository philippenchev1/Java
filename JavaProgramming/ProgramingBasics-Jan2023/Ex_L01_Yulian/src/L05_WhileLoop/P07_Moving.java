package L05_WhileLoop;

import java.util.Scanner;

public class P07_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wide = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int allCubicMeters = wide * length * height;

        while (!command.equals("Done")){
            int currentBoxes = Integer.parseInt(command);
            allCubicMeters -= currentBoxes;

            if (allCubicMeters < 0 ){
                System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(allCubicMeters));
                break;
            }
            command = scanner.nextLine();
        }

        if (allCubicMeters >= 0){
            System.out.printf("%d Cubic meters left.",allCubicMeters);
        }

    }
}
