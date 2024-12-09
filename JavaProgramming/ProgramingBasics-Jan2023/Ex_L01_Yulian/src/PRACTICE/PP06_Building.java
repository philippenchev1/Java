package PRACTICE;

import java.util.Scanner;

public class PP06_Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int flours = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        for (int i = flours; i >= 1 ; i--) {
            for (int j = 0; j < rooms ; j++) {
                if (i == flours){
                    System.out.printf("L%d%d ",i,j);
                } else if (i % 2 == 0) {
                    System.out.printf("0%d%d ",i,j);
                }else {
                    System.out.printf("A%d%d ",i,j);
                }

            }
            System.out.println();


        }

    }
}
