package NestedLoops;

import java.util.Scanner;

public class P06_Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        for (int f = floors; f >= 1 ; f--) {
            for (int r = 0; r < rooms ; r++) {
                if (f == floors){
                    System.out.printf("L%d%d ",f,r);
                } else if (f % 2 == 0) {
                    System.out.printf("O%d%d ",f,r);
                }else {
                    System.out.printf("A%d%d ",f,r);
                }

            }
            System.out.println();

        }

    }
}
